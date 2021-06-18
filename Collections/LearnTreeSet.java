/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc TreeSet in Collections Framework
 */

 /**
  * It is similar to set<> in C++.
  * It creates a collection that uses a tree for storage internally.
  * Objects are stored in sorted, ascending order. Contains unique values.
  */

import java.util.*;
class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<String> TSet=new TreeSet<>();
        TSet.add("varun");
        TSet.add("Sandeep");
        TSet.add("Praveen");
        TSet.add("Harshini");
        TSet.add("Shreya");
        TSet.add("Praveen"); //If duplicate elements are added, they are ignored....
        Iterator<String> it=TSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(TSet);

        //Fetching lowest and highest items in TreeSet
        System.out.println(TSet.pollFirst()); //first item is removed even.
        System.out.println(TSet.pollLast());  //first item is removed even.

        //Iterating in revrse order
        Iterator<String> rev_it=TSet.descendingIterator();
        while(rev_it.hasNext()){
            System.out.print(rev_it.next()+" ");
        }
    }    
}
