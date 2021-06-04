/** 
 * @author Praveen Reddy Chalamalla
 * Created on 2021-06-02
 * @desc Assignment 1.1 Factorial.
*/
import java.util.Scanner;
import java.math.BigInteger;

class Factorial{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number : ");
        String s=sc.next();
        int n=Integer.parseInt(s);
/** 
 * Useful BigInteger Constructors:
 * BigInteger​(String val)	Translates the decimal String representation of a BigInteger into a BigInteger.
 * BigInteger​(String val, int radix)	Translates the String representation of a BigInteger in the specified radix into a BigInteger.
 */
        BigInteger res=new BigInteger(Integer.toString(1));
        for(int i=1;i<=n;i++) res=res.multiply(new BigInteger(Integer.toString(i)));
        System.out.println(res);
        sc.close();
    }
}