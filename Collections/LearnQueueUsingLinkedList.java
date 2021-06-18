/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-17
 * @desc Implementation of Queue using LinkedList class.  Similarly Stack can be implemented.
 */
import java.util.*;
class LearnQueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<6;i++) q.add(i); //adds element at last

        System.out.println(q.size());

        System.out.println("Queue: "+q);
        
        System.out.println("Front Removed: "+q.remove()); //Removes first element

        System.out.println("Queue: "+q);

        System.out.println("Front of Queue: "+q.peek()); //Returns the front of queue

        q.addLast(10);
        System.out.println("Queue: "+q);
    }
}
