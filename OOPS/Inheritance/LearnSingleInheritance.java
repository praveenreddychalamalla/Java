/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc This code demonstrates the concept of Single Inheritance.
 * Only Single, Multilevel, Heirarchiel inheritances are supported in java through classes. Java does not support Multiple and Hybrid inheritance through classes.
 */


 /**
  * Single Inheritance
  */
 class BaseClass{
     public void baseClassDetails() {
         System.out.println("I am from Base Class");
     }
 }
 class DerivedClass extends BaseClass{ //Inherits Class BaseClass

 }
 class Exam{
     public void examDetails() {
         System.out.println("Showing Exam Details");
     }
 }
 class GATE extends Exam{ //Inherits Class Exam
     public void gateExamDetails() {
        System.out.println("Showing Gate Exam Details");
     }
 }


 class Area{
    int length;
    int breadth;

    /**Public API */
    public void setLength(int x) {
        length=x;
    }
    public void setBreadth(int x) {
        breadth=x;
    }
    public void showArea(){
        System.out.println("Length= "+length);
        System.out.println("Breadth= "+breadth);
        System.out.println("Area= "+length*breadth);
    }
 }
 class Volume extends Area{
     int height;

    /**Public API */
     public void setHeight(int x) {
        height=x;
    }
    public void showVolume(){
        showArea();
        System.out.println("Height= "+height);
        System.out.println("Volume= "+length*breadth*height);
    }
 }
 

 
class LearnSingleInheritance{
    public static void main(String args[]){
        
        /**Single Inheritance */
        DerivedClass ob1=new DerivedClass();
        ob1.baseClassDetails(); //Invokes the method of Parent Class

        GATE ob2=new GATE();
        ob2.examDetails(); // Invokes the method of Parent Class - Exam
        ob2.gateExamDetails(); //Invokes the method of Child Class - GATE

        Volume ob3=new Volume();
        ob3.setLength(5);
        ob3.setBreadth(10);
        ob3.setHeight(15);
        ob3.showVolume();
    }
}