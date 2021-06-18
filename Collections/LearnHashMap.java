/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-18
 * @desc Map Interface in Collections Framework.
 */
/**
 * Similar to unordered_map<> in c++.
 * SortedMap,TreeMap Interfaces is similar to map<> in C++.
 * HashMap Vs TreeMap : HashMap allows exactly one null key but TreeMap doesn't allow it. HashMap is unordered while TreeMap is ordered.
 */
import java.util.*;
class LearnHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "CoviShield");
        map.put(2, "Covaxin");
        map.put(3, "SputnikV");
        map.put(4, "Pfizer");
        map.put(2, "NovaVax");//Duplicate key if entered, will be ignored

        //Map.Entry interface enables us to work with a map entry. Entry is subinterface of Map.
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //Removing entries from HashMap
        map.remove(2);
        map.remove(1, "CoviShield"); //Element will be remove only if key value pair matches
        map.remove(3, "Pfizer"); //Element is not removed in this case
        System.out.println("After Removal");
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
