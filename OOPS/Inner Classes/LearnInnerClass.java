/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-13
 * @desc Nested Classes.
 */

/**
 * Nested class - a class defined within another class. 
 * Nested class - Non static nested class, static nested class
 * Non static nested class - Member inner class, Ananymous inner class, Local inner class.
 *  
 * Nested class have no independent existence, obviously it depends upon the existence of outer class.
 * The scope of a nested class is bounded by the scope of the outer class.
 * A nested class has an access to all the members of the outer class, but vice versa doesn't hold.
 * A nested class can be created inside a method or loop or any code block.
 * 
 * Note: Inner Classe are a phenomenon of the compiler, not the virtual machine(JVM)
 */
class OuterClass{
    private String strOuter="Praveen Reddy";

    class InnerClass{ //Non static Member inner class
        private int data =1999;
        void innerShow(){
            System.out.println("String is "+strOuter);
            System.out.println(data);
        }
        /**
         * static void innerShow1(){    //Error: Static methods cannot be declared inside non static class(Top level must be static)
         *  --------;
         *  --------;
         * }
         */
        
    }
    void outerShow(){
        new InnerClass().innerShow(); //Outer Class has no access to inner class directly, hence object of inner class should be created to access if inner class is non static
    }
}
class LearnInnerClass{
    public static void main(String args[]){

        //We cannot create objects directly for the inner class , but an outer class object is not mandatory to create (Has to be created if inner class is non static).
        
         OuterClass outer_ref=new OuterClass();
         OuterClass.InnerClass inner_ref=outer_ref.new InnerClass(); //Note: Type of innerclass object must be OuterClass.InnerClass, hence we cannot create an object InnerClass obj=new InnerClass() as such
        inner_ref.innerShow();
     
        new OuterClass().new InnerClass().innerShow(); //Same as above 3 lines
        outer_ref.outerShow();
    }
}
