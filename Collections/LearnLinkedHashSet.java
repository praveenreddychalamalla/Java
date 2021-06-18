/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc LinkedHashSet in Collections Framework
 */

/**
 * LinkedHashSet class maintains a linked list of entries in insertion order in the set.
 * LinkedHashSet class contains unique elements like HashSet. This allows insertion-order iteration over the set.
 * Order is maintained and returned through an iterator. Effectively, LinkedHashSet = HashSet + Insertion Order.
 */
import java.util.*;
class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> LHSet=new LinkedHashSet<>();
        LHSet.add("varun");
        LHSet.add("Sandeep");
        LHSet.add("Praveen");
        LHSet.add("Harshini");
        LHSet.add("Shreya");
        LHSet.add("Praveen"); //If duplicate elements are added, they are ignored....
        Iterator<String> it=LHSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(LHSet);
    }
}
