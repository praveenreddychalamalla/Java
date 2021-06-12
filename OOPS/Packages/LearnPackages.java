
/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-12
 * @desc Packages in Java
 */

/**
 * A package is a group of similar types of classes, interfaces and sub-packages.
 * If a package is imported using wild card (*), it is implicit import, else explicit import (Using specific classes/interfaces)
 * Static import allows you to import static members of class directly in your code without using class name.
 */
import static java.lang.Math.*;
import mypackage.*;
public class LearnPackages {
    public static void main(String args[]){
        double x=ceil(2.6); //If math is not imported in static way, then Math.ceil() should be used;
        System.out.println(x);
        double y=5.6;
        Calculator calculate=new Calculator();
        double res=calculate.multiply(x,y);
        System.out.println(res);
    }  
}
