/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Access Modifiers with Inheritance 
 */

/**
 * Default, public and protected members (methods also) can be inherited and are accessible inside derived classes.
 * Private members and methods are never inherited!.
 */
class A{
    public int a;
    int b; //Default
    protected int c;
    private int d; 
    void show(){
        a=0;
        b=1;
        c=2;
        d=3; 
        System.out.println(a+b+c+d);
    }
    private void privateShow(){
        System.out.println("I am Private Show");
    }
    protected void protectedShow(){
        System.out.println("I am Protected Show");
        privateShow();
    }
}

class B extends A{

    void show(){ //show() of Class A is Overridden
        a=0;
        b=10;
        c=100;
        // d=1000; Error, 'd' private member of class A is not visible here.
        System.out.println(a+b+c);
        protectedShow();
        //privateShow(); Error, priavteShow() private method of class A is not visible here.
    }
}
class LearnInheritanceAccessModifiers{
    public static void main(String args[]){
        A ob1=new A();
        ob1.show();

        B ob2=new B();
        ob2.show();
    }
}