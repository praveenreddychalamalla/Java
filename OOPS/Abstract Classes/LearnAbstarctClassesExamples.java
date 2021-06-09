/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-09 
 * @desc Abstract Classes in JAVA
 */
abstract class Shape{
    double s1,s2;
    Shape(double x, double y){
        s1=x;
        s2=y;
    }
    abstract double area();
}
class Rectangle extends Shape{
    Rectangle(double x, double y){
        super(x,y);
    }
    double area(){
        return s1*s2;
    }
}
class Triangle extends Shape{
    Triangle(double x, double y){
        super(x,y);
    }
    double area(){
        return 0.5*s1*s2;
    }
}
class LearnAbstarctClassesExamples {
    public static void main(String args[]){
        Shape ref=new Rectangle(10, 10);
        System.out.println("Area of Rectangle= "+ref.area());
        ref=new Triangle(10, 10);
        System.out.println("Area of Triangle= "+ref.area());
     }
}
