/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-10
 * @desc Static Blocks Usage
 */

 /**
  * The static block is used for static initializations of static class members
  */
class ClassWithStaticBlock{
    static String name;
    static{
        name="Praveen Reddy";
        System.out.println("Static Block of class ClassWithStaticBlock Called");
    }
} 
class LearnStaticBlocksUsage {
    static int data;
    static{
        data=10;
        System.out.println("Static Block of class LearnStaticBlockUsage Called");
    }
    public static void main(String args[]){
        System.out.println("data = "+data);
        System.out.println("name = "+ClassWithStaticBlock.name);
    }

}
