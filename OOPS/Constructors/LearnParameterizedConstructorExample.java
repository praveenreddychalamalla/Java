/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Example of Parameterized Constructor with inheritance
 */

class Person{
    int age;
    String name;
    Person(int x, String s){
        age=x;
        name=s;
    }
}
class Employee extends Person{
    double salary;
    Employee(int age, String name, double sal){
        super(age,name); //Must be passed , else results error as there is no default constructor in the base class
        salary=sal;
    }
    void show(){
        System.out.println("Name= "+name+", Age= "+age+", Salary= "+salary);
    }
}
class LearnParameterizedConstructorExample {
    public static void main(String args[]){
        Employee e=new Employee(22,"Praveen Reddy",100000);
        e.show();
    }
}
