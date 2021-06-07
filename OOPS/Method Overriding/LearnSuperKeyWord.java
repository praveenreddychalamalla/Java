/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Usage of Super keyword in Java
 */
/**
 * super keyword is used to access data members and methods of base class if there exists other members and methods with same name in derived class.
 * super keyword can also be used to invoke the constructor of base class.
 * super keyword always refers to immediate base class
 */
class A{
    int data;
    void show(){
        System.out.println("Hello from Parent Class");
    }
}
class B extends A{
    int data=20;
    void show(){
        super.show(); //Trying to call show method of base class. If super keyword is not used then here it leads to infinte recursion
        super.data=80;
        System.out.println("Hello from Child Class");
        System.out.println(super.data+","+this.data); //System.out.println(super.data+","+data); works same.
    }
}
public class LearnSuperKeyWord {
    public static void main(String args[]){
        B ob=new B();
        ob.show();
    }
}
