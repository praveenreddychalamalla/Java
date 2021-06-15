/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-15
 * @desc Generics in Java
 */

/**
 * Similar to templates in C++ ):-
 * The idea behind generics is to allow anytype (Integer, String,...etc and user-defined types) to be passed as a parameter to methods, classes and interfaces
 * Generic entity - An entity such as class, interface, or method that operates on a parameterized type.
 * Using generics, we can create classes that work with different data types. 
 * 
 * WildCard in Generics - When the type is unknown or can vary, wild card is used
 * In java, ? is a wild card. ? represents unknown type. Type parameter is replaced by ?
 * wild card can be used as type of parameter, field, return type or local variable.
 * Wild cards - Upper bounded, Lower bounded, Unbounded
 * 
 * Note: No static field can use type parameters.
 */
import java.util.Arrays;
import java.util.List;
//<? extends UpperBoundType> It restricts the unknown type to be a specific type or a subtype
//<? Super LowerBoundType> It restricts the unknown type to be a specific type or a supertype
class UpperBoundWildCard{
    
    public static double listSum(List<? extends Number> L){ //List with any data type which extends Number class can be passed as argument
        double sum=0;
        for(Number x:L)
            sum+=x.doubleValue();
        return sum;
    }

}
class GenericClass<T>{ //Similarly we can work with multiple types .
    T data;
    GenericClass(T data){
        this.data=data;
    }
    public T getItem(){
        return data;
    }
    void showType(){ // Type of instance can be determined at run time
        String s= data.getClass().getName();
        System.out.println("Type of data : "+s);
    }
}
class GenericMethodSquare{
    public static<T extends Number> double square(T a){ // T extends Numbers, which means that T can be int, float, double
        return a.doubleValue() * a.doubleValue();
    }
}
class LearnGenerics {
    public static void main(String args[]){
        int a=(int)GenericMethodSquare.square(5);
        System.out.println(a);
        double b=GenericMethodSquare.square(3.3);
        System.out.println(b);
        // GenericMethodSquare.square('2'); Error. T expects Number type 

        GenericClass<Integer> ref1=new GenericClass<Integer>(5); //We cannot give primitives like int, double etc for Type
        System.out.println(ref1.getItem());
        ref1.showType();

        GenericClass<String> ref2=new GenericClass<String>("Praveen Reddy"); //We cannot give primitive int
        System.out.println(ref2.getItem());
        ref2.showType();

        List<Integer> intList=Arrays.asList(1,2,3,4); //Integer is a subclass of Number class
        System.out.println("Sum = "+UpperBoundWildCard.listSum(intList));

        List<Double> doubleList=Arrays.asList(1.2,2.3,3.5,4.6); //Double is a subclass of Number class
        System.out.println("Sum = "+UpperBoundWildCard.listSum(doubleList));

    }
}
