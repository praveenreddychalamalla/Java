/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-10
 * @desc Static Members
 */

/**
 * The keyword static is used for class variables, class methods and static blocks
 * When a varaible or method is declared static, it belongs to the class as whole (Only 1 copy is present)and not any object
 * A static member can be accessed before any objects of its class are created.
 * A static function can use only static data members i.e., other static variables or other static functions.
 * Default value for a static variable is zero for numerical type and null for string type, user defined type.
 * 
 * Note: Static methods also can be overloaded. We cannot overload two methods if they differ only by static keyword or return type
 * Usage of 'this' and 'super' keywords is not allowed inside a static method.
 */
class ClassWithStaticNonStaticData{
    int data;
    static int objectCnt; //Static member initialized to default value 0.
    ClassWithStaticNonStaticData(int x){ //Creation of any object leads to increment of cnt by 1.
        objectCnt++;
        data=x;
    }
    static void staticFun(){ //Static Method
        //this.data=this.data+5; //We cannot use 'this' and 'super' keywords in a static method 
        System.out.println("Hello from Static Function");
        //We cannot use 'i' or call display() method in this block. We can use only static data memebrs in this block
    }
    void display(){
        System.out.println("Calling Static method");
        staticFun(); //A static method can be called from anywhere (calling from a static method here, but a non static method cannot be called from a static method)
    }
    void show(){
        System.out.println("Data ="+data);
        System.out.println("Object Count ="+objectCnt);
    }
}
class LearnStaticKeyword{
    public static void main(String args[]){
        //static int x; //Error. We cannot create a static local variable, because a static variable must be at class level.

        ClassWithStaticNonStaticData.staticFun();
        // ClassWithStaticNonStaticData.display(); Error, display() method is non static
        System.out.println("Object Count="+ClassWithStaticNonStaticData.objectCnt);

       /**
        *  StaticMethods ob=new StaticMethods(); 
        *  ob.staticFun(); //Allowed, but not a good practice
        *  ob.cnt++; //
       */

        ClassWithStaticNonStaticData ob1=new ClassWithStaticNonStaticData(10);
        ob1.display();
        ob1.show();
        
        ClassWithStaticNonStaticData ob2=new ClassWithStaticNonStaticData(10);
        ob2.show();
    }
}