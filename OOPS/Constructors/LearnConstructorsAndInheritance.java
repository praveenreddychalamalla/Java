/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Constructor invoking with inheritance
 */

/**
 * Constructor of base class is always called before constructor of derived class.
 * Super keyword can be used to call the base class version of constructor. 
 * Note: The super keyword must be the first statement inside the constructor of derived class
 */
class ConstructorBase{
    ConstructorBase(){
        System.out.println("Default Constructor of class ConstructorBase");
    }
}

class ConstructorDerived1 extends ConstructorBase{
    ConstructorDerived1(){
        System.out.println("Default Constructor of class ConstructorDerived1");
    }
}
class ConstructorDerived2 extends ConstructorBase{
    ConstructorDerived2(){
        super(); //Invokes the immediate base class constructor. If you don't write this, Java provides this implicitly ):-
        System.out.println("Default Constructor of class ConstructorDerived2");
    }
}
class LearnConstructorsAndInheritance {
    public static void main(String args[]) {
        new ConstructorDerived1();
        new ConstructorDerived2();
    }
}
