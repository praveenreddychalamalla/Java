/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-15
 * @desc Generic Constructors
 */

 /**
  * A constructor can be generic, even if the class is not. Similar to generic methods
  */
class ClassWithGenericConstructor{
    double data;
    public<T extends Number> ClassWithGenericConstructor(T data){
        this.data=data.doubleValue();
    }
    void show(){
        System.out.println("Data : "+data);
    }
}
class LearnGenericConstructor {
    public static void main(String[] args) {
        ClassWithGenericConstructor obj1= new ClassWithGenericConstructor(3);
        ClassWithGenericConstructor obj2= new ClassWithGenericConstructor(4.5);
        obj1.show();
        obj2.show();
    }
}
