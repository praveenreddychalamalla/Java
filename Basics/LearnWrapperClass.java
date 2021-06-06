/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-05 
 * @desc Wrapper Classes, AutoBoxing and Auto UnBoxing
 */


/**
 * Wrapper Classes are used to wrap primitive data types. In synchronization, multithreading,  we need objects but not primitive data types.
 * Custom Wrapper classes can also be created.
 * Note:  Primitive types are more efficient than corresponding objects, hence if efficiency is requirement,it is always recommended to use primitive types
 */

class MyInteger{ //Custom Wrapper Class
    private int i;
    //Constructor
    MyInteger(int j){
        i=j;
    }

    //Public Api
    public int intValue(){
        return i;
    }
}
class LearnWrapperClass{
    public static void main(String args[]){

        int gate_score=713; //Primitive data type 
        // gate_score is local variable, hence memory is alloted in stack. If new operator is used then memory will be alloted in heap
        
        Integer wrapped_gate_score=Integer.valueOf(gate_score); //Calling the valueOf() method in Integer Wrapper Class. Static Method - Hence can be called using class name without any object.
        // wrapped_gate_score is an Integer object, hence memory is alloted in heap. Even though new operator is not visible here, valueOf method uses internally
        // We can also use Integer wrapped_gate_score = new Integer(gate_score); But this is not preffered

        int x=wrapped_gate_score.intValue(); //Fetching primitive int value present in Integer Object

        System.out.println(gate_score);
        System.out.println(wrapped_gate_score);
        System.out.println(x);
        //Integer will still behave same as that of int except that it has some added benifits (Sync)

/**
 * Auto Boxing - Automatic conversion of primitive types to the object of their corresponding wrapper classes. 
 * int --> Integer, long --> Long , double --> Double etc.,
 * Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects. Compilers support AutoBoxing
 * Similarly Auto Unboxing - Revrse process of AutoBoxing.
 * 
 * Note: AutoBoxing and Auto Unboxing are supported only for predefined wrapper classes but not user defined wrapper classes.
 */
        Integer y=gate_score; //AutoBoxing. New Integer object is created.
        System.out.println(y);

        int z=y; //Auto UnBoxing
        System.out.println(z);

        MyInteger rank=new MyInteger(637); // MyInteger rank = 637; Results error
        System.out.println(rank.intValue());


    }
}