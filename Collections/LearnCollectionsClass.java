import java.util.ArrayList;

/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc Collections Class in Collections Framework
 */

/**
 * Collections Class has all the static methods that operate on the collections.
 * All the methods of this class throw the NullPointerException if the collection or object passed to the method is null.
 * C++ has STL - Java has Collections
 */
import java.util.*;
class LearnCollectionsClass {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("C");
        list1.add("C++");
        list1.add("Java");
        System.out.println(list1);
        Collections.addAll(list1, "Python","Kotlin","Swift");
        System.out.println(list1);

        String[] arr1={"Node.JS","React"};
        Collections.addAll(list1, arr1);
        System.out.println(list1);

        ArrayList<Integer> list2=new ArrayList<Integer>();
        Integer[] arr2={1,3,4,1,6,2,8,9,1,2};
        Collections.addAll(list2, arr2);
        System.out.println(list2);

        System.out.println("Min: "+Collections.min(list2));
        System.out.println("Max: "+Collections.max(list2));
        System.out.println("Freq of 1: "+Collections.frequency(list2, 1));

        Collections.reverse(list2);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

    }
}
