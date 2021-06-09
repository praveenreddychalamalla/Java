/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-09 
 * @desc Implementation of multiple inheritance through interfaces
 */

/**
 * Interface is the only mechanism which allows implementing multiple inheritance in JAVA.
 *
 */
interface FuelInfo{
    void fuelInfo();
}
class Bentley{
    String brand="Bentley";
    void showBrand(){
        System.out.println("Brand= "+brand);
    }
}
// 'extends' keyword must appear before 'implements' keyword
class Azure extends Bentley implements FuelInfo{ //Note: only one class can be extended and any no.of interfaces can be implemented.
    String model="Azure";
    public void fuelInfo(){
        System.out.println(model+" runs on Petrol");
    }
}
public class LearnMultipleInheritanceWithInterfaces {
    public static void main(String args[]){
        FuelInfo ref =new Azure();
        ref.fuelInfo();
        //ref.brand(); Error, invisible to ref ):-
        //ref.showBrand(); Error, invisible to ref ):-
        // ref.model; Error, invisible to ref ):-
    }
}
