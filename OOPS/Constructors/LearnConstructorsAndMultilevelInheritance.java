/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-06 
 * @desc Working of Constructors in Multilevel Inheritance.
 */

/**Constructor Chaining is invoked by default , Super key word is added implicitly*/
class ConstructorParent{
    ConstructorParent(){
        System.out.println("Default Constructor of Parent");
    }
}
class ConstructorChild extends ConstructorParent{
    ConstructorChild(){
        //super(); will be added by java compiler implicilty
        System.out.println("Default Constructor of Child");
    }
}
class ConstructorGrandChild extends ConstructorChild{
    ConstructorGrandChild(){
        //super(); will be added by java compiler implicilty
        System.out.println("Default Constructor of GrandChild");
    }
}
class LearnConstructorsAndMultilevelInheritance {
    public static void main(String args[]){
        new ConstructorGrandChild();
    }
}
    
