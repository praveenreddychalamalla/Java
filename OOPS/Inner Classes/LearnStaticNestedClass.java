/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-13
 * @desc Static Nested Classes.
 */

/**
 * Static Nested Class - An inner class with static keyword. 
 * It has access only to static data members of the outer class.
 * It cannot refer to non-static members of the outer class directly. If you want to  access non static members, then these must be accessed though objects
 */
class StaticNestedClass{

    static String s="Static String - Praveen Reddy";
    int data =1999;
    static class StaticInner{
        void innerShow1(){
            System.out.println("\nI'm Non Static Method");
            System.out.println(s);
            // System.out.println(data); Error, Cannot refer to non static members
        }
        void innerShow2(){
            System.out.println("\nI'm Non Static Method");
            int data=new StaticNestedClass().data; //Non static member 'data' of 'StaticNestedClass' is accessed through object. 
            System.out.println(s);
            System.out.println("Non Static Int "+data);
        }
        static void innerShow3(){ //Static method, can be invoked without creating any object
            System.out.println("\nI'm Static Method");
            int data=new StaticNestedClass().data; //Non static member 'data' of 'StaticNestedClass' is accessed through object. 
            System.out.println(s);
            System.out.println("Non Static Int "+data);
        }
    }
    void outerShow(){
        System.out.println("\nI m Outer Class Method, Calling Inner class method");
        StaticInner.innerShow3(); // As inner class is static and innerShow3 method is also static, it can be called directly without creating an object for inner class.
        //StaticInner.innerShow2(); Error. innerShow1(), innerShow2() method are non static methods, hence cannot be invoked without object.
    }
}
public class LearnStaticNestedClass {
    public static void main(String args[]){
        StaticNestedClass.StaticInner inner_ref;
        inner_ref=new StaticNestedClass.StaticInner(); //Object for Inner class is created without creating an object for outer class as inner class is static.
        inner_ref.innerShow1();
        inner_ref.innerShow2();

        StaticNestedClass.StaticInner.innerShow3(); //As innerShow3() is  static method, it can be called without creating object for inner class also.
        
        new StaticNestedClass().outerShow();
    }
}
