/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-08 
 * @desc Demonstrates Runtime polymorphism
 */

/**
 * Polymorphism - Same name having different forms
 * Binding/Linking is the process where a function call is linked to function definition
 * Run time polymorphism - Linking a function call to function defintion is done at run-time. It is achieved through function overriding.
 * At run-time it is decided which function is to be called by checking the reference and object to which the reference is pointing
 * Run time linking - Dynamic binding/ Late binding
 */

 /**
  * Note: In C++, we need to declare a function as virtual to override a method and achieve runtime polymorphism
  * But here in Java, we need not declare the function as virtual! Beacuse all functions are virtual by default.
  * To be precise, Every non-static method in Java is a virtual function.
  * In comparision to C++ vtable and vptr concepts, JVM internally manages the runtime polymorphism and internal implementation might vary from one JVM to another
  */
class PolyExampleBaseA{
    void show(){
        System.out.println("Showing PolyExampleBaseA"); //Method1
    }
}
class PolyExampleDerivedB extends PolyExampleBaseA{
    void show(){
        System.out.println("Showing PolyExampleDerivedB"); //Method2, Base class show() method is overridden
    }
}
class PolyExampleDerivedC extends PolyExampleBaseA{
    void show(){
        System.out.println("Showing PolyExampleDerivedC"); //Method3, Base class show() method is overridden
    }
}
class LearnRunTimePolymorphism {
    public static void main(String args[]){
        PolyExampleBaseA ref=new PolyExampleBaseA(); //ref refers to an object of class PolyExampleBaseA. ref can also refer to an object of a class which inherited PolyExampleBaseA
        ref.show(); //After memory allocation - During runtime, ref is assigned a reference to an object of class PolyExampleBaseA, hence this function call is linked to Method1 defintion
/*
 * When compiler sees this line, it doesn't know whether ref is referring to an object of class PolyExampleBaseA or an object of class which inherited  PolyExampleBaseA
 * It is because, childclasses overridden the show() method and compiler is not sure about the method definition to which this function call has to be linked. 
 * Hence compiler doesn't link this function call to any method defintion. It is left unresolved.
 * During runtime, memory is allocated and it will be known, to which object ref will be referring and hence linking can be performed appropriately.
*/
        ref=new PolyExampleDerivedB(); //ref refers to an object of class PolyExampleDerivedB which is a derived class of PolyExampleBaseA
        ref.show(); //After memory allocation - During runtime, ref is assigned a reference to an object of class PolyExampleDerivedB, hence this function call is linked to Method2 defintion

        ref=new PolyExampleDerivedC(); //ref refers to an object of class PolyExampleDerivedC which is a derived class of PolyExampleBaseA
        ref.show(); //After memory allocation - During runtime, ref is assigned a reference to an object of class PolyExampleDerivedC, hence this function call is linked to Method3 defintion

        //Linking the function call to the definition is done at runtime and show() method is behaving differenlty depending on the context.
        // Hence runtime polymorphism
    }
}
