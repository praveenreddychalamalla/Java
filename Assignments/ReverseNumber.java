/** 
 * @author Praveen Reddy Chalamalla
 * Created on 2021-06-02
 * @desc Assignment 1.2 Reversing a Number.
*/
import java.util.Scanner;

class ReverseNumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int res=0,n;
        n=sc.nextInt();
        while(n!=0){
            res=res*10+n%10;
            n/=10;
        }
        System.out.println(res);
        sc.close();
    }
}