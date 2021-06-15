/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-15
 * @desc Generic Inheritance
 */
/**
 * A Non generic class can also be extended by generic class.
 * Generic class also permits method overriding, but possible with same type only.
 */
class GenericBase<T>{ //Similarly, we can work with multiple typed parameters
    T itemB;
    GenericBase(T itemB){
        this.itemB=itemB;
    }
    void show(){
        System.out.println("Item Base: "+itemB);
    }
}

class GenericDerived<T> extends GenericBase<T>{ //Typed Parameter must be same <T>. Even if you don't use it in base class also, it must be mentioned 
    T itemD;
    GenericDerived(T itemB, T itemD){
        super(itemB);
        this.itemD=itemD;
    }
    void show(){
        super.show();
        System.out.println("Item Derived: "+itemD);
    }
}
class LearnGenericInheritance {
    public static void main(String[] args) {
        GenericDerived<String> obj1=new GenericDerived<>("Reddy", "Praveen");
        obj1.show();
    }
}
