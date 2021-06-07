/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Demonstrates Method Overriding
 */

/**
 * Method Overriding refers to redefining the base class method in a derived class. 
 * A method of base class with same signature with different implementation is written in the derived class. Signature of 2 methods must match
 */
 class Base{
    void show(){
        System.out.println("Hello from Base Class");
    }
 }
 class Derived extends Base{
    void show(){ //Overriding the show() Method that has been inherited from the class Base
        System.out.println("Hello from Derived Class");
    }
 }
class LearnMethodOverriding{
    public static void main(String args[]){
       Base ob1=new Base();
       ob1.show();

       Derived ob2=new Derived();
       ob2.show(); //Invokes the overridden show() method

       Base ob3=new Derived();
       ob3.show(); //Base class show() method is overridden, hence still invokes overridden show() method.
       /**
        * Had it been a scenario in C++ i.e., A base class pointer "ptr" pointing to its derived class object.
        * If show() method is invoked using ptr (ptr->show()) then base class show() method is invoked instead of overridden show() method 
        */
    }
}