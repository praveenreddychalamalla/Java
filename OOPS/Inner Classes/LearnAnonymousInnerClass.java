/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-13
 * @desc Nested Classes - Non Static Nested Class - Anonymous Inner Class.
 */

/**
 * Anonymous inner class - Inner class without any name.
 * Declaration of anonymous inner class is just an expression. So these are created in a single expression at the point of use. 
 * Example: Listeners in event handling, method of Thread class
 */
abstract class CovidPatient{
    abstract void eatAndDrink();
}
class LearnAnonymousInnerClass {
    public static void main(String args[]){
        //Note: We are not creating object of abstract class, before the terminating semi-colon entire class is defined.
        CovidPatient cv=new CovidPatient() //Looks like invocation of constructor but has complete class within {}.
        { //Class Started.
            void eatAndDrink(){
                System.out.println("Eating: Healthy food and fruits");
                System.out.println("Drinking: Juices ");
            }
        }; //Class ended. If you want to create another object of this class, it is not possible as it doesn't have any name.(You have to define the class again)
        cv.eatAndDrink();
    }
}
