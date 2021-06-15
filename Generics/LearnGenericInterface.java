/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-15
 * @desc Generic Interfaces
 */

interface Relocate<U>{
    void move(U item, String location); //Public and abstract by default
}
class GenericClassImplementingRelocate<U> implements Relocate<U>{ //Same type parameter <U> must be mentioned in the implementing class
    
    public void move(U item, String location){ //public access specifier is mandatory
        System.out.println("Move "+item+" to "+ location);
    }
}

interface MemberInterface<V>{
    boolean isMember(V item, V[] arr);
}
class GenericClassImplementingMemberInterface<V> implements MemberInterface<V>{
    public boolean isMember(V item, V[] arr){
        for(V it: arr){
            if(it==item) return true;
        }
        return false;
    }
}
class LearnGenericInterface {
    public static void main(String[] args) {
        GenericClassImplementingRelocate<String> obj1 =new GenericClassImplementingRelocate<>();
        obj1.move("Bike", "Parking");

        GenericClassImplementingRelocate<Integer> obj2 =new GenericClassImplementingRelocate<>();
        obj2.move(23, "1999");

        GenericClassImplementingMemberInterface<String> obj3= new GenericClassImplementingMemberInterface<>();
        String[] strArr={"A","B","C","F"};
        System.out.println(obj3.isMember("C", strArr));

        GenericClassImplementingMemberInterface<Integer> obj4= new GenericClassImplementingMemberInterface<>();
        Integer[] intArr={3,5,6,1,10};
        System.out.println(obj4.isMember(11, intArr));


    }
}
