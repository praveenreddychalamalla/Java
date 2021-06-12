/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-10
 * @desc  final keyword in Java
 */

/**
 * Using the final keyword means that the value can't be modified in the future
 * The final keyword in java is equivalent to the const keyword in C/C++
 * The keyword final can be used to create a final variable, final method, final class or to apply to arguments of the method
 * There is also a notion of blank final, where a final variable is just declared but initialized later. But can be initialized only in constructor.
 * 
 * final method -  A method defined as final in base class cannot be overridden in the derived classes. final keyword is used to prevent method overriding.
 * final class - A class declared as final can never be inherited. Example: System class ):-
 * final method parameters - Parameters of a method if declared as final, restricts the method not to change the passed parameters
 */

class BaseFinalMethod{
    final void show(){
        System.out.println("I can never be overridden");
    }
    void display(){
        System.out.println("Hello from Base class");
    }
}
class DerivedFinalMethod extends BaseFinalMethod{
    /**
     * void show(){ //Results in compile time error. Cannot override final methods
     *   --------
     *   --------
     *  }
    */
    void display(){
        System.out.println("Hello from Child class");
    }
}
class ClassWithBlankFinal{
    final String AADHAR_NO; //Blank final variable. Can be initialized only in the constructor.
    String name;
    ClassWithBlankFinal(String name, String aadhar){
        this.name=name;
        AADHAR_NO=aadhar;
    }
    void show(){
        System.out.println(name+" "+AADHAR_NO);
    }

}
class LearnFinalKeyword {
    public static void main(String args[]){
        final double pi=3.14;
        double radius=2.3;
        System.out.println("Area= "+pi*radius*radius);
        //pi=2*pi ; //Error, Final members cannot be modified
       
        BaseFinalMethod ref= new DerivedFinalMethod();
        ref.show();
        ref.display();

        ClassWithBlankFinal person1=new ClassWithBlankFinal("Praveen Reddy", "1234 5678 9012");
        ClassWithBlankFinal person2=new ClassWithBlankFinal("Sandeep Reddy", "9012 1234 5678");
        person1.show();
        person2.show();
        
    }
}
