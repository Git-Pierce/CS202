package ListSetMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class SetHashSet {
    public static void main(String[] args){

        Set<String> stooges = new TreeSet<>();
        stooges.add("Shemp");
        stooges.add("Larry");
        stooges.add("Curly");
        stooges.add("Moe");
        System.out.println("stooges" + stooges);

        Iterator<String> itr = stooges.iterator();
        while (itr.hasNext()){
            String a = itr.next();
            System.out.println("a word" + a);
            itr.remove();
        }
        System.out.println(stooges);

    }
}
