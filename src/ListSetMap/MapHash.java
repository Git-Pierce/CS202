package ListSetMap;

import java.util.HashMap;
import java.util.*;

public class MapHash {
    public static void main(String[] args){
        // Create key value pairs
        Map<Integer, String> stooges = new TreeMap<>(); //orders by key
        stooges.put(01, "Curly");
        stooges.put(10, "Hugh");
        stooges.put(11, "Moe");
        stooges.put(02, "Moe");
        System.out.println("stooges" + stooges);

        //Iterator<String> itr = stooges.iterator(); Cannot iterate over maps
        System.out.println("Keyset" + stooges.keySet());  //return set of all keys in this map
        System.out.println("Values List" + stooges.values()); //returns a collection of values in this map
        System.out.println("Get value at key 0: " + stooges.get(0));   //returns value at key 0
        stooges.replace(0, "CurlyTwo");
        System.out.println("Get value at key 0 again: " + stooges.get(0));
        System.out.println("Map size: " + stooges.size());
        if (stooges.containsKey(1)){
            System.out.println("Key 1: " + stooges.get(1));
        }
        System.out.println(stooges);
        // use keyset to store the keys in a set and get unique values
       Set<Integer> nums = stooges.keySet();
        for (int num: nums){
            System.out.println("Set Nums: " + num);
        }
        //Map and sets allow multiple values
        Collection<String> names = stooges.values();
        for (String name: names){
            System.out.println("Set Names: " + name);
        }
        //Combine key and values in a for loop
        for (int num: stooges.keySet()){
            String name = stooges.get(num);
            System.out.println("name: " + name + ", Key is: " + num);
        }

    }
}
