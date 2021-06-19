/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc Threads in Java
 */

 /**
  * Each thread defines a separate path of execution. 
  * Multithreading - Involving more than one thread to run concurrently.
  * Creating Threads in Java - Extend Thread Class / Impelement Runnable Interface.
  */
class MyThread extends Thread{ //Extending Thread Class makes the new class to become a thread.
    public void run(){
        System.out.println(getName()+" is running.....");
    }
}
/**
 * Every object of MyThread Class is a thread. Method start() starts the thread, this immediately calls the run method.
 * Code that we want to execute by thread is put in run method. Each thread gets a name as Thread-0, Thread-1, so on.
 * getName() method gives the name of the thread.
 */
public class LearnThreads {
    public static void main(String[] args) {

        new MyThread().start(); //Object of MyThread Class is created, which is a thread and start method is invoked.
        new MyThread().start(); //Object of MyThread Class is created, which is a thread and start method is invoked.
        new MyThread().start(); //Object of MyThread Class is created, which is a thread and start method is invoked.
    }
}
