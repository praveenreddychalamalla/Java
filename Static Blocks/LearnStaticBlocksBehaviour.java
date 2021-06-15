/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-10
 * @desc Static Blocks Behaviour
 */

 /**
  * A static block is created by keyword static and {}: static{} is a static block
  * The block is used for static initializations of static class members
  * The code inside the static block is executed before the main method.
  * The code executes only once when the class first loads into memory.
  * The need for a static block arises when you want to run some code during class loading before the main function such as loading some libraries
  */
class StaticBlockExample1{

    static{ //static block - executes only once, when this class gets loaded into memory for the first time 
        System.out.println("I'm loaded into memory Second");
    }
}
class StaticBlockExample2{
    static{ //static block - executes only once, when this class gets loaded into memory for the first time 
        System.out.println("I'm loaded into memory last");
    }
}

//As this class has main method, it will be loaded into memory first and all static blocks of this class will be executed before execution of main method
class LearnStaticBlocksBehaviour { //If main method is not written - Produce error Since java 6. Before java 6, code used to compile but failto run.
    
    static{ //static block - executes only once, when this class gets loaded into memory for the first time 
        System.out.println("I'll load first");
        new StaticBlockExample1(); //class StaticBlockExample1 is loaded into memory, hence all its static blocks will be executed 
    }
    public static void main(String args[]){
        System.out.println("I am main");
        new StaticBlockExample2(); //class StaticBlockExample2 is loaded into memory, hence all its static blocks will be executed 
    }
}
