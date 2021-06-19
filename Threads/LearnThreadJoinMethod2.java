/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc Join Method with Time bound in Threads
 */
class JoinMethodExample2 extends Thread{
    JoinMethodExample2(String s){
        super(s);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(300);
                System.out.println(getName()+" i= "+i);
            }
            catch(InterruptedException e){
                System.out.println("Error: "+e);
            }
        }
    }
}
class LearnThreadJoinMethod2 {
    public static void main(String[] args) {
        JoinMethodExample2 th1=new JoinMethodExample2("First");
        JoinMethodExample2 th2=new JoinMethodExample2("Second");
        JoinMethodExample2 th3=new JoinMethodExample2("Third");
        th1.start();
        try{
            //Thread "First" - th1 , can atmost make use of 900 ms to make other threads wait. 
            th1.join(900); //Unlike simple join method, we are not going to wait forever to complete th1 execution, we are going to wait only for 900 ms. Until 900 ms complete, no other thread is given a chance to execute.
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        //After 900 ms all the 3 threads are vyving for CPU time.
        th2.start();
        th3.start();
    }
}
