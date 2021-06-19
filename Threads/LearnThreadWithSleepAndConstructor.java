/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc Threads in Java
 */

/**
 * sleep method syntax: Following sleep methods are present in the thread class
 * public static void sleep(long milliseconds)throws InterruptedException
 * public static void sleep(long milliseconds, int nanos)throws InterruptedException
 */
class SleepingThread extends Thread{
    SleepingThread(String tname){
        super(tname);
    }
    public void run(){
        System.out.println(getName()+" started ");
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(800); //Thread sleeps for 800 ms of time. We should not awake a sleeping thread, it may throw an exception!
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(getName()+" i="+i);
        }
        System.out.println(getName()+" finished");
    }
}
public class LearnThreadWithSleepAndConstructor {
    public static void main(String[] args) {
        SleepingThread st1=new SleepingThread("First"); //Thread Named "First" is created.
        SleepingThread st2=new SleepingThread("Second"); //Thread Named "Second" is created.
 /**
  * Two threads are vyving for cpu's time and when one thread sleeps, another thread gets the cpu time.
  * Note: Output differs from system to system and depends the load of the system which makes the output unpredictable 
  */       
       
        st1.start();
        st2.start();
    }
}
