/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-09 
 * @desc Interfaces in JAVA
 */

 /**
  * Interface is just like a class but it has all its methods as abstract with signature only. Interfaces provides perfect example of abstraction
  * An Interface is declared using the keyword 'interface' followed by interface name. Default access specifier for an interface is public
  * Constants in an interface are by default static and final.
  *
  *
  * An interface is a group of related methods without defintion and constants.
  * All methods declared in an interface are implictly public and abstract
  * The interface must be implemented by classes using the keyword 'implements'.
  * An interface can be extended by other interfaces using 'extends' keyword. 
  * An interface can be implemented by an abstract class also
  *
  * Note:  We cannot create objects for an interface, but we can have reference to an interface i.e., reference pointing to a class which implements the interface
  * As methods in an interface are public by default, one must specify the acess specifier 'public' while implementing any method of interface. 
  * Since JAVA 8, interfaces can also have default, private, static methods. But if any of these keywords is specified, then the method must be provided body.
  */
interface MyInterface{
    void fun(); //By deafult fun is public and abstract method 
}
class MyClass1 implements MyInterface{
    public void fun(){ //Public access specifier is must. If access specifier is not mentioned, 'default' access specifier will be alloted which conflicts the signature of method in interface 
        System.out.println("fun of MyClass1");
    }
}
class MyClass2 implements MyInterface{
    public void fun(){ //Public access specifier is must. If access specifier is not mentioned, 'default' access specifier will be alloted which conflicts the signature of method in interface 
        System.out.println("fun of MyClass2");
    }
    void enjoy(){
        System.out.println("Enjoy with interfaces");
    }
}
class LearnInterfaces {
    public static void main(String args[]){
        MyInterface ref=new MyClass1(); //reference of an interface is allowed. But it cannot be used to acess the explicit members or methods of implemented class
        ref.fun();
        ref=new MyClass2();
        ref.fun();
        //ref.enjoy(); Error. ref has no idea of any other method or members  present in class MyClass2.
    }
}
