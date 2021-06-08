/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Main Method Overloading
 */
class LearnMainMethodOverloading {
    static void main(int a){
        System.out.println("Main with int argument");
    }
    static void main(double d){
        System.out.println("Main with double argument");
    }
    static void main(){
        System.out.println("Main without argument");
    }
    public static void main(String args[]){
        LearnMainMethodOverloading.main(10);
        LearnMainMethodOverloading.main(100.2);
        LearnMainMethodOverloading.main();

    }
}
