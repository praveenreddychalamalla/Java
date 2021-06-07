/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Working of Parameterized Constructors with inheritance 
 */

/**
 * If thers is no default constructor in any class in inheritance, default Constructor chaining is not entrtained with parameterized constructors. Must be invoked explicitly
 * Common practice is to pass parameters from constructor of derived class to base class
 * Arguments to base class constructor can be passed using super keyword.
 */
class ParameterizedConstructorBase{
    int a;
    ParameterizedConstructorBase(int x){
        a=x;
        System.out.println("Constructor of class ParameterizedConstructorBase is called");
    }
    void show(){
        System.out.println("a="+a);
    }
}
class ParameterizedConstructorDerived extends ParameterizedConstructorBase{
    int b;
    ParameterizedConstructorDerived(int x,int y){
        //super(); Error, Class ParameterizedConstructorBase does not have a default constructor.
        super(x);  //You must provide the parameter to invoke constructor of class ParameterizedConstructorBase.
        // Without the line super(x); also results error, as super() will be added by default by javac.
        b=y;
        System.out.println("Constructor of class ParameterizedConstructorDerived is called");
    }
    void show(){
       super.show();
       System.out.println("b="+b);
    }
}
class LearnParameterizedConstructorsAndInheritance{
    public static void main(String args[]){
        ParameterizedConstructorDerived ob= new ParameterizedConstructorDerived(10,30);
        ob.show();
    }
}