/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Abstract Classes in JAVA
 */

/**
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * 
 * The keyword abstract is used for declaring a class as abstract. An abstract class can have abstract or non abstract methods
 * An abstract method has no body i.e., no implementation
 * An abstract class cannot be instantiated i.e., you cannot create objects for an abstract class, but a reference to an abstract class can be created.
 * A derived class must provide implementation of all the abstract methods if there are any, in the parent class.
 * If the derived class doesn't provide implementation, then the derived class also becomes abstract.
 * 
 * Note: Abstract keyword cannot be applied to constructors, variables, static intialization block, instance intialization block
 * Abstract method cannot be declared as private.
 */

/**
 * class A{
 *  abstract void fun(); //Error. An abstract method cannot be declared in a non abstract class!
 * }
 */
abstract class Doctor{
    abstract void treatPatient(); //Abstract Method - Depending on the type of doctor, the way of treating patients will be different, hence leave the implementation to whoever inherits this class 
    abstract void giveMedicines(); //Abstract Method
    void workPlace(){ //Non Abstract Method
        System.out.println("Works at Hospital");
    }
}
class Pediatrician extends Doctor{ //Must provide the implementation of all abstract methods in Class Doctor
    void treatPatient(){
        System.out.println("I will treat Children");
    }
    void giveMedicines(){
        System.out.println("I will give medicines to children");
    }
}
class Cardialogist extends Doctor{ //Must provide the implementation of all abstract methods in Class Doctor
    void treatPatient(){
        System.out.println("I will treat heart diseases");
    }
    void giveMedicines(){
        System.out.println("I will give medicines which cures the heart");
    }
}
class LearnAbstractClasses {
    public static void main(String args[]){
       Pediatrician ob1=new Pediatrician();
       ob1.treatPatient();
       ob1.giveMedicines();
       ob1.workPlace();
       
       Cardialogist ob2= new Cardialogist();
       ob2.treatPatient();
       ob2.giveMedicines();
       ob2.workPlace();

       Doctor ob3=new Pediatrician(); //Doctor ob3=new Doctor() ; Error. Abstract class can't be instantiated.
       //But only the inherited members and methods can be accessed through ob3.
       ob3.treatPatient();
       ob3=ob2;
       ob3.treatPatient();
    }
}
