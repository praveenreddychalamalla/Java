/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc Join Method in Threads
 */

/**
 * Join method is useful when we want one thread to finish completely before giving a chance to another thread!
 * The join() method waits for a thread to terminate. It causes the currently running threads to stop executing, until thread on which join method is called finishes its task.
 * 
 * Join Method has various versions as follows:
 * public void join()throws InterruptedException
 * public void join(long milliseconds)throws InterruptedException
 * public void join(long millis, int nanos)throws InterruptedException
 * Note: The second and third versions of join waits for the thread to wait for a given time before it dies.
 */
class JoinMethodExample1 extends Thread{
    JoinMethodExample1(String s){
        super(s);
        start(); //Thread is started immeadiately after it is created
    }
    public void run(){
        try{
            System.out.println("Hello from thread "+getName());
            Thread.sleep(1000);
            System.out.println("Bye from thread "+getName());
        }
        catch(InterruptedException e){
            System.out.println("Error : "+e);
        }
    }
}
class LearnThreadJoinMethod1{
    public static void main(String[] args) {
        try{
            //No thread start its execution until thread "First" completes its execution as join method is called on it. But this might lead to starvation.
            new JoinMethodExample1("First").join(); //Thread is created and start is invoked, as start() is present in constructor of JoinMethodExample1 and then join method is invoked on this thread.
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        new JoinMethodExample1("Second");
        new JoinMethodExample1("Third");
    }
}