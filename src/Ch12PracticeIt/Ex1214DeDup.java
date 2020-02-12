package Ch12PracticeIt;
//Write a recursive method called dedup that takes a string as a parameter and that returns a new string obtained by replacing every sequence of repeated adjacent letters with just one of that letter. For example,
//        the string "bookkkkkeeper" has three repeated adjacent letters ("oo", "kkkkk", and "ee"), so the call of dedup("bookkkkkeeper") should return "bokeper".
//        Do not call the string replace or split methods in your solution.

public class Ex1214DeDup {
    public static void main(String[] args){
        System.out.println(dedup("bookkeeper"));
    }
    public static String dedup(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            char first = s.charAt(0);
            System.out.println("ELSE first: " + first );
            String rest = dedup(s.substring(1));
            System.out.println("ELSE dedup first: " + first + " , rest: " + rest);
            if (!rest.isEmpty() && first == rest.charAt(0)) {
                System.out.println("ELSE IF first: " + first + ", rest: " + rest);
                return rest;
            } else {
                System.out.println("ELSE ELSE first: " + first + ", rest: " + rest);
                return first + rest;
            }
        }
    }
}
