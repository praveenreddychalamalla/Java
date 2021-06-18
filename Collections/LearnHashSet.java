/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc HashSet in Collections Framework
 */

/**
 * HashSet implements the Set interface which implements the Collection interface.
 * HashSet contains unique elements only, which are inserted on the basis of thier hashcode.
 * It is similar to unordered_set<> in c++.
 */

import java.util.*;
class LearnHashSet{
    public static void main(String[] args) {
        HashSet<String> hSet=new HashSet<>();
        hSet.add("varun");
        hSet.add("Sandeep");
        hSet.add("Praveen");
        hSet.add("Harshini");
        hSet.add("Shreya");
        hSet.add("Praveen"); //If duplicate elements are added, they are ignored....
        Iterator<String> it=hSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(hSet);

        //Creation of HashSet from ArrayList

        ArrayList<Integer>roll_numList=new ArrayList<Integer>();
        roll_numList.add(9);
        roll_numList.add(10);
        roll_numList.add(19);
        roll_numList.add(42);
        HashSet<Integer>roll_numSet=new HashSet<>(roll_numList);
        System.out.println(roll_numSet);
    }
}