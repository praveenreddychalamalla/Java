/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-04 
 * @desc String Buffer Class and String Bulider Class
 */

 /**
  * A StringBuffer is like a String, but can be modified i.e., Mutable
  * String Builder class is same as String Buffer. The only differece is String Builder class methods are not thread safe. 
  * All the methods of String Buffer Class can be used with String Builder Class 
  */
class LearnStringBuffer{
    public static void main(String args[]){
         //Default Constructor- Creates a string buffer with no charcaters in it an initial capacity of 16 charcaters
        StringBuffer s1=new StringBuffer("Java");
        System.out.println(s1); 
        System.out.println(s1.capacity()); //Prints 16+4

        s1.append("Course");
        s1.append(1); //Methods of String Buffer Class are overloaded for all primitive data types.
        s1.append(true);
        System.out.println(s1);

        StringBuffer s2=new StringBuffer("Learn ");
        s2.append("Java").append(" ").append("Happily"); //Method Chaining
        System.out.println(s2);

// Unlike String Class, + operator is not overloaded for concatenation in String Buffer Class. Hence  s1+s2 results error. Only append can be used

        s1.delete(10,15); //Deletes from [10,15)
        System.out.println(s1);

        s1.insert(4," ");
        s1.insert(0,"Fun ");
        s1.insert(4,"with ");
        System.out.println(s1);

        //public synchronized StringBuffer replace(int startIndex, int endIndex)
        s1=s1.replace(3,14," "); //Replaces everything between [start,end) with passed string
        System.out.println(s1);

        //public synchronized StringBuffer reverse(). No reverse method in String Class
        StringBuffer s3=s1.reverse();
        System.out.println(s3);
        System.out.println(s1); //s1 is also modified
    }
}