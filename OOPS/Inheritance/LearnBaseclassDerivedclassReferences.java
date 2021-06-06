/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Understanding Base class and derived class references
 */
/**
 * A Base class reference can store an object of Base class or an object of Derived class. But reverse is not possible
 * Having stored a reference of an object of Derived class in a Base class reference variable , you can only access methods that are inherited from base class
 * (Similar to Base class Pointer pointing to Child class Object Concept C++)
 */
class BaseRefernce{
    void show(){
        System.out.println("I belong to class BaseReference");
    }
}
class DerivedReference extends BaseRefernce{
    void display(){
        System.out.println("I belong to class DerivedReference");
    }
}
class LearnBaseclassDerivedclassReferences{
    public static void main(String args[]){
        BaseRefernce ob1= new DerivedReference(); //ob1 refers to an object of class DerivedReference. ob1 can hold a refernce of an object of class BaseRefrence  or class DerivedReference. 
        /**Note: ob1 can only access methods that are inherited from class BaseReference*/
        ob1.show();
        // ob1.display(); Error, display() method strictly belongs to class DerivedReference, it is not inherited. Hence we cannot access using ob1.

    }
}