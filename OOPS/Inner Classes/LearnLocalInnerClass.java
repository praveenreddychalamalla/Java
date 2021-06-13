/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-13
 * @desc Nested Classes - Non Static Nested Class - Local Inner Class.
 */

/**
 * Local Inner Classes - inner classes that are defined inside a block
 * Block can be method, loop, if clause etc.,
 * A local inner class can access all the members of the enclosing class.
 * 
 * Note: A local inner class can never declared as static.
 * A local inner class cannot be declared with acess modifiers. They cannot be private or protected or public.
 * Scope of local inner class is restricted to the block they are defined in.
 */
class LocalInnerClass{
    private String data="Outer Class - Praveen Reddy";
    void display(){
        String local_var="Sandeep Reddy";
        class LocalInner{ //Local Inner Class Start here.
            void showInner(){
                System.out.println(data);
                System.out.println(local_var);
                data="Ch. Praveen Reddy"; 
                System.out.println(data);
                //local_var="Ch. Sandeep Reddy";//Error. A local inner class can access all the members of the outer class and local variables in the scope it is defined. But it cannot modify the local variable of the method in which it is defined.
            }
        }//Local Inner Class end here.
        new LocalInner().showInner();
    }
    //new LocalInner().showInner(); //Error. It's scope persits within display().
}
class LearnLocalInnerClass {
    public static void main(String args[]){
        new LocalInnerClass().display();
    }
   
}
