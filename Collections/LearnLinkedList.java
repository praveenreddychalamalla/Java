/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-17
 * @desc LinkedList class in Collections Framework 
 */

/**
 * LinkedList class implements the List interface. It provides a linked-list datastructure.
 * LinkedList class uses a doubly linked list to store the elements.
 * LinkedList class can also be used as a list, stack or queue.
 */
import java.util.*;
class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> vList=new LinkedList<String>();
        vList.add("Covishield");
        vList.add("Covaxin");
        vList.add("Sputnik");
        vList.add("Pfizer");

        System.out.println("Total Items: "+vList.size());

        System.out.println(vList); //Prints all the elements of vList

        Iterator<String> it=vList.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        vList.addFirst("India");
        vList.addLast("Russia");
        System.out.println(vList);

        System.out.println(vList.getFirst());
        System.out.println(vList.getLast());

        vList.removeFirst();
        vList.removeLast();
        System.out.println(vList);

        Iterator<String> it2=vList.descendingIterator();//Similar to reverse iterator in C++
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }
        System.out.println();
    }
}
