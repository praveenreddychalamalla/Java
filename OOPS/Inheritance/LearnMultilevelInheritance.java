/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc This code demonstrates the concept of Multilevel Inheritance. 
 * Only Single, Multilevel, Heirarchiel inheritances are supported in java through classes. Java does not support Multiple and Hybrid inheritance through classes.
 */

/**
 * Multilevel Inheritance
 */
 class Parent{
   void showParent(){
       System.out.println("Hello from Parent");
   }
 }
 class Child extends Parent{ //Inherits class Parent
   void showChild(){
       System.out.println("Hello from Child");
   }
 }
 class GrandChild extends Child{ //Inherits class Child
   void showGrandChild(){
       System.out.println("Hello from Grand Child");
   }
 }


 class Car{
     void vehicleType(){
        System.out.println("Vehicle type is Car");
     }
 }
 class Honda extends Car{
     void company(){
         System.out.println("Car Company is Honda");
     }
 }
 class Brio extends Honda{
    void Model(){
        System.out.println("Car model is Brio");
    }
}
class LearnMultilevelInheritance{
   public static void main(String args[]){
       

       /** Multilevel Inheritance */
       GrandChild ob1= new GrandChild();
       ob1.showGrandChild();
       ob1.showChild();
       ob1.showParent();

       Brio ob2=new Brio();
       ob2.Model();
       ob2.company();
       ob2.vehicleType();
       
   }
}