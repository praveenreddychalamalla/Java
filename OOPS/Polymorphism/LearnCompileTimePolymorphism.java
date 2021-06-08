/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-08 
 * @desc Demonstrates Compile time polymorphism
 */

/**
 * Polymorphism - Same name having different forms
 * Binding/Linking is the process where function is linked to function definition.
 * Compile time polymorphism - Linking a function call to function defintion is done at compile time
 * Compile time polymorphism is achieved through function overloading (Function Polymorphism). Function Overloading doesn't save memory
 * Compile time linking - Static binding/ Early binding
 */
class OverloadedFunctions{

    //Overloaded Methods must differ either in no.of arguments or atleast in one type of arguments i.e., Signature must be different (Excluding return type)
    
    
    void show(int a){   //Method1
        System.out.println("a= "+a);
    }
    /**
     * int show(int a){ //Results Error, Function call is ambiguious. You cannot overload like this. 
     * --------------
     * --------------
     * }
     */
    void show(String s){    //Method2  
        System.out.println("S= "+s);
    }
    void show(Boolean b){   //Method3
        System.out.println("b= "+b);
    }
    void show(int a,int b){   //Method4
        System.out.println("a= "+a+", b= "+b);
    }
    void show(int a,String s){   //Method5
        System.out.println("a= "+a+", S= "+s);
    }
    void show(String s,int a){   //Method6
        System.out.println("s= "+s+", a= "+a);
    }
    void show(int a,int b,int c){   //Method7
        System.out.println("a= "+a+", b= "+b+", c= "+c);
    }
    
}
/**
 * Whenever compiler sees a function call, it tries to link the function call to the definition of method whose signature is same as function call
 * This is done during compilation, hence function overloading is compile time polymorphism
 */
class LearnCompileTimePolymorphism {
    public static void main(String args[]){
        OverloadedFunctions ob=new OverloadedFunctions();
        ob.show(10,20,30);  //This function call is linked to definition of Method7 during compilation

        ob.show(50,100);   //This function call is linked to definition of Method4 during compilation

        ob.show(10,"Praveen Reddy");    //This function call is linked to definition of Method5 during compilation

        ob.show("Praveen Reddy",10);    //This function call is linked to definition of Method6 during compilation

        ob.show(10);    //This function call is linked to definition of Method1 during compilation

        ob.show("Praveen Reddy");   //This function call is linked to definition of Method2 during compilation

        ob.show(true);  //This function call is linked to definition of Method3 during compilation

        //Depending on the context i.e., Type and no.of arguments passed, same show() method is behaving differently. This is Polymorphism
    }
}
