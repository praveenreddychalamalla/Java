/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-04 
 * @desc String Class in Java
 */

/**
 * Strings are Immutable in Java
 * Unlike C++ (String literals - Null Terminated Character Sequences), Java Strings are objects of String Class backed by character array internally.
 * String Literals are stored and cached in string pool (String Constant pool) which helps in saving memory by sharing.
 */
class LearnStrings{
    public static void main(String args[]){
        String course1="Java";  // String object will be created implicitly by Java compiler. "Java" literal is stored in String pool, saves memory.
        String course2="Java";  // As "Java" is already present in String pool, Course2 also refers to same "Java" literal. course1, course2 refer same object in String pool
        
        String course3=new String("Java");  //Explicitly creating String object. New object is created in heap and "Java" is stored in it.
        String course4=new String("Java");  //New object is created in heap and "Java" is stored in it.
        
        System.out.println(course1+" "+course2);
        System.out.println(course3);
        System.out.println(course4);
        
        if(course1==course2)
            System.out.println("Course1 and Course2 are Same");

        if(course1!=course3)
            System.out.println("Course1 and Course3 are different ):-");

        if(course3!=course4)
            System.out.println("Course3 and Course4 are different):-");
        
/**
 * String Constructors : Default, Parameterized.
 * Default Constructor prodcues an emmpty string object
 */
        char[] a={'P','R','A','V','E','E','N'};
        String s=new String(a); // Parameterized Constructor. Another String can also be passed as parameter as seen before
        System.out.println(s);

/** 
 * Frequently Used String Methods:
 * public int length() - Returns length of String .
 * public char charAt(int index) - Returns Char present at the index passed.
 * public String concat(String s) - Returns String concatinated with s.
 * public boolean equalsIgnoreCase(String S) - Returns boolean value, true if Strings are equal after ignoring case sensitivity, else false
 * public String replace(char oldChar, char newChar) - Retruns a String by replacing all the occurances of oldChar with newChar
 * public String substring(int beginIndex, int endIndex) - Returs a String from [begin,end). 
 * public String trim() - Returns a string by trimming leading and trailing white spaces
 * public static String valueOf(type b) - Converts any data type to string.
 */
        System.out.println(s.length());

        System.out.println(s.charAt(3));

        s=s.concat(" REDDY"); //New string object is created, then concatenated with passed string and new string object reference is returned.
        // Hence reference has to be caught else changes won't take place. Same happens with any String class method whose return type = String, as String are immutable.
        System.out.println(s);

        System.out.println(course1.equals("JAVA"));
        System.out.println(course1.equalsIgnoreCase("JAVA"));
        System.out.println(course1.equals(course3));

        course3=course3.replace('a','i'); 
        System.out.println(course3);

        String x=s.substring(8);
        System.out.println(x);
        x=s.substring(3,11);
        System.out.println(x);

        x="   "+s+"  ";
        System.out.println(x+".");
        x=x.trim();
        System.out.println(x+".");

        System.out.println("Value ="+String.valueOf(23.10));
    }
}