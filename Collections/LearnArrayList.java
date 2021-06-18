/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-17
 * @desc ArrayList class in Collections Framework 
 */

/**
 * Collections framework is set of classes, interfaces. All the classes and interfaces are generic.
 * All the classes and interfaces of collection framework are present in java.util package.
 * 
 * ArrayList class implements List interface. It is a variable-lenth array of object references.
 * Simlar to vectors in C++.
 */
import java.util.*;
class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>vList=new ArrayList<Integer>();
        vList.add(23);
        vList.add(10);
        vList.add(30);
        vList.add(5);

        //Accessing Items
        System.out.println("Total Items: "+vList.size());

        System.out.println(vList); //Prints all the elements of vList
        
        for(int i=0;i<vList.size();i++){ //Traditional way of accessing elements
            System.out.print(vList.get(i)+" ");
        }
        System.out.println();

        for(Integer i : vList) {
            System.out.print(i+" ");
        }
        System.out.println();

        Iterator<Integer> it=vList.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //Methods 
        Collections.sort(vList);
        System.out.println(vList);
       
        System.out.println(vList.isEmpty());


        Integer [] a=vList.toArray(new Integer[vList.size()]); //Converting ArrayList to Array.
        for(Integer i:a) 
            System.out.print(i+" ");

        List<Integer> vList2=new ArrayList<>();
        vList2=Arrays.asList(a);
        System.out.println(vList2); //Converting Array to ArrayList

        vList.clear();

        System.out.println(vList.isEmpty());
    }
}
