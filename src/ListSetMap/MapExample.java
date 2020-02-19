package ListSetMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class MapExample {
    public static void main(String[] args){
        // Create key value pairs
            Map<Integer, String> stooges = new HashMap<>();
            stooges.put(0, "Larry");
            stooges.put(0, "Curly");
            stooges.put(1, "Moe");
            stooges.put(2, "Moe");
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

        }
    }

