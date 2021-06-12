/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-10
 * @desc Static Blocks Vs Constructors
 */

/**
  * Note: We cannot define a static constructor in java! If we define a constructor with static keyword, a compile-time error will occur
  * Both static and constructor are opposite to each other. Static is class level and constructor is object level.
  */
class BlockAndConstructor{
    BlockAndConstructor(){
        System.out.println("Constructor Called");
    }
    static{ //Executed only once, for the first time when this class gets loaded into memory
        System.out.println("Static Block Called");
    }
}
class LearnStaticBlocksAndConstructors {
    public static void main(String args[]) {
        new BlockAndConstructor();
        new BlockAndConstructor();
    }
}
