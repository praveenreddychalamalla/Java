/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-17
 * @desc PriorityQueue class in Collections Framework.
 */

 /**
  * PriorityQueue class implements Queue Interface.
  * This is similar to priority_queue<> in C++. But, Default Priority = ELement with smaller value has high priority. Min heap will be implemented 
  */
import java.util.*;
class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(); //By default min heap is implemented.
        pq.add(10);
        pq.add(5);
        pq.add(14);
        pq.add(2);

        System.out.println("Top: "+pq.element());
        System.out.println("Top: "+pq.peek());

        System.out.println("Popped Element: "+pq.poll());
        System.out.println("Popped Element: "+pq.poll());

        System.out.println("Top: "+pq.peek());
    }
   
}
