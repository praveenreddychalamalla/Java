/** 
 * @author Praveen Reddy Chalamalla
 * Created on 2021-06-02
 * @desc For each loop in Java. Introduced in Java 5.
*/

class LearnForEachLoop{
    public static void main(String args[]){
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9,10};
        char[] arr2=new char[]{'P','r','a','v','e','e','n'};
        String s="Praveen Reddy";
/**
 * for(data_type var_name: item){ //Can be used with arrays and collections 
 *  ------------------
 *  ------------------
 * }
 * Avoids usage of subscript to access the elements in item. 
 */
        for(int x: arr1){
            System.out.print(x+" ");
        }

        System.out.println();
        
        for(char x: arr2){
            System.out.print(x+" ");
        }

        System.out.println("\n"+s);
/**   for(char x: s) { // Error, but allowed in C++. Unlike C++, strings in java are objects but not null terminated character sequences.
 *        System.out.print(x);
 *   }
 *  In C++, string literals always produce null-terminated character sequences, and not string objects. The member functions of string class 
 *  are overloaded in such a way that they can be used with both string objects as well as null terminated char sequences.
*/
       
    }
}