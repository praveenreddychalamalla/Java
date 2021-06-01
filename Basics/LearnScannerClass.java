/** 
 * @author Praveen Reddy Chalamalla
 * Created on 2021-06-01
 * @desc Usage of Scanner class
*/
 
import java.util.Scanner;
class LearnScannerClass{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in); //Creates an Object of Scanner
        /**Scanner class provides methods like nextInt, nextFloat, nextBoolean,next, nextLine,
         *  nextByte, nextDouble, nextShort, nextLong to read appropriate data from the user
        */
        System.out.println("Enter Name :");
        String name=input.nextLine(); //Reads the entire line
        System.out.println("Enter Branch Code :");
        String branch =input.next(); //Reads Entire Word
        System.out.println("Enter GATE Score :");
        int score=input.nextInt();
        System.out.println(name+" has Scored "+Integer.toString(score)+" in GATE "+branch);
        input.close();
    }
}