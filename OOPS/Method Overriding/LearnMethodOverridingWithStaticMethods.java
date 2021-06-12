/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-10
 * @desc Overriding Static Methods!! .
 */

/**
 * We cannot override static methods of a class. But we can declare static methods with the same signature in the subclass, 
 * But it is not considered overriding as there won't be any run-time polymorphism
 */
class ClassWithStaticMethod1{
    static void show(){
        System.out.println("I belong to the class ClassWithStaticMethod1 ");
    }
    void show(String s){ //Overloading static methods
        System.out.println(s);
    }
}
class ClassWithStaticMethod2 extends ClassWithStaticMethod1{
    static void show(){ // void show(); results error. Signature must match, else conflicts with the show() method that has been extended
        System.out.println("I belong to the class ClassWithStaticMethod2 ");
    }
    void show(String s){ //  Overriding the inherited show(String s) method.
        System.out.println("Overridden "+s);
    }
}
public class LearnMethodOverridingWithStaticMethods {
    
    public static void main(String args[]){
        ClassWithStaticMethod1 ref=new ClassWithStaticMethod2();
        ClassWithStaticMethod1.show();
        ClassWithStaticMethod2.show();
        //ref.show(); //No error, No runtime polymorphism will be seen. Uncomment and execute.
        // show() method of ClassWithStaticMethod1 will be invoked instead of show() method of ClassWithStaticMethod2
        ref.show("Praveen Reddy"); 
    }
}
