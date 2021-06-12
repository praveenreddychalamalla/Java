/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-09 
 * @desc Interfaces Examples
 */

/**
 * Since JAVA 8, interfaces can also have default, private, static methods. But if any of these keywords is specified, then the method must be provided body
 */
interface Figure{
    double PI=3.14; //By default PI is final and static
    double area();  //By default area() is public and abstract

    default void show(){ //Non abstract methods, allowed since JAVA 8. But Public non abstract methods are never allowed.
        System.out.println("Showing Interface");
    }
}
class Square implements Figure{
    double s;
    Square(double x){
        s=x;
    }
    public double area(){
        return s*s;
    }
}
class Circle implements Figure{
    double r;
    Circle(double x){
        r=x;
    }
    public double area(){
        // PI=3.145; Error. Final members cannot be modified. Read only operation on them is allowed
        return PI*r*r;
    }
}
class LearnInterfacesExamples {
    public static void main(String args[]){
      Figure ref=new Square(5);
      ref.show();
      System.out.println("Area of Square= "+ref.area());
      ref=new Circle(5);
      System.out.println("Area of Circle= "+ref.area());
    }
}
