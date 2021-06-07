/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-03 12:07:45
 * @desc Demontrates Constructors and Constructor Overloading
 */

 /**
  * Constructor - Special method of a class used to initialize the objects. Constructor doesn't have any return type (Not even void)
  * Constructor is invoked automatically when an object of a class is created. 
  * If you do not define the constructor explicitly in a class, Java compiler automatically creates a default constructor with an empty body.
  * Constructors - Default, Parameterized.
  *
  * If you declare a constructor as private, you cannot create objects outside the class. 
  * Typically done to create only one object instance of the class which is managed by the class itself (Singleton Class - Design Pattern)
  *
  * Note : Like C++, Java also supports copy constructor. But, unlike C++, Java doesn’t create a default copy constructor if you don’t write your own
  * Note : Java lacks a built-in way to define default arguments for methods and constructors.
  */
class Point{
    double x;
    double y;
/**
 * Java does provide a default constructor, but if you create any constructor in the class on your own,
 * then it's your responsibilty to provide the default constructor too.
 */
    Point(){ //Default Constructor - No Arguments
        x=0;
        y=0;
    }
    //Point(double a, double b=0)   Results Error. Default arguments are not supported for any method in Java
    Point(double a , double b){ // Parameterized Constructor.
        x=a;
        y=b;
    }
    Point(Point p){ //Copy Constructor.
        x=p.x;
        y=p.y;
    }
    void show(){
        System.out.println("Point=("+x+","+y+")");
    }
}
class LearnConstructors{
    public static void main(String args[]){
        Point p1=new Point(),p2=new Point(2.5,2);
        p1.show();
        p2.show();  
        Point p3=new Point(p2); // Cloning takes place. p2, p3 refers to different objects.
        p3.x+=2;
        p2.show();
        p3.show();
        Point p4=p2; //Cloning doesn't take place. Both p2, p4 refers to same object. (This is default copying in C++ where both refer to different objects)
        p4.x+=10;
        p2.show(); 
        p4.show();
    }
}