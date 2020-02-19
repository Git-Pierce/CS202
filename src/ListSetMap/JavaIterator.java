package ListSetMap;

import java.util.*;

public class JavaIterator {
    public static void main(String[] args){
        List<String> words = new LinkedList<String>();

        for (int i = 0; i < 10; i++){
            words.add("add"+i);
        }

        Iterator<String> itr = words.iterator();
        String result = itr.next();
        System.out.println("Result b4" + result);
        while (itr.hasNext()){
            String next = itr.next();
            if (next.length() > result.length()){
                result = next;
            }
        }
        System.out.println("Result after" + result);
    }
}
