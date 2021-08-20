/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-08-18
 */
class intList{
    int first;
    intList rest;
    public intList(int val){
        first=val;
        rest=null;
    }
    public static intList incrementList(intList start,int x){
        if(start==null)return null;
        intList newStart=new intList(start.first+x);
        intList trav=newStart;
        start=start.rest;
        while(start!=null){
            trav.rest= new intList(start.first+x);
            trav=trav.rest;
            start=start.rest;
        }
        return newStart;
    } 
    public static void printList(intList start){
        if(start==null)return ;
        while(start!=null){
            System.out.print(start.first+" ");
            start=start.rest;
        }
        System.out.println();
    }
}
class Test{
    public static void main(String args[]){
       intList L=new intList(5);
       L.rest=new intList(10);
       L.rest.rest=new intList(15);
       L.rest.rest.rest=new intList(20);
       intList.printList(L);
       intList L2= intList.incrementList(L,10);
       intList.printList(L2);
       
    }
}