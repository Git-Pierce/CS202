package ListSetMap;

import java.io.*;
import java.util.*;

public class ListExample {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            words.add("add"+i);
        }

        //Iterator MUST be DECLARED AFTER LIST is manipulated,
        // otherwise concurrent exceptions will occur

        Iterator<String> itr = words.iterator();

        System.out.println("Iterator has next" + itr.hasNext());
        //System.out.println("Iterator next" + itr.next());
        System.out.println("Iterator remove" );
        if (itr.hasNext()){
            System.out.println(words);
            String a = itr.next();
            System.out.println("word" + a);
            itr.remove();

        }

//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
       // System.out.println(new File("somefile.txt").getAbsoluteFile());
       // Scanner scan = new Scanner(file);

        //Scanner input = new Scanner(file);
        System.out.println("Word list" + words);
//        while (input.hasNext()){
////           String word = input.next();
////            System.out.println(word);
////            words.add(word);
////            System.out.println(word);
////        }
        System.out.println("Remove 1st words");
        while (!words.isEmpty()){
          words.remove(0);
           System.out.println("Words array" + words);
        }

        System.out.println("Done" + words);
    }
}
