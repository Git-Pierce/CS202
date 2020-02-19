package ListSetMap;

import java.util.*;

public class SetExample {
    public static void main(String[] args){

        Set<String> stooges = new HashSet<>();
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
