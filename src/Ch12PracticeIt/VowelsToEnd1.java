package Ch12PracticeIt;
//Write a recursive method called vowelsToEnd that takes a string as a parameter and returns a string
//        in which all of the vowels have been moved to the end.
//        The vowels should appear in reverse order of what they were in the original word.
//        For example, the call of vowelsToEnd("beautifully") should return "btfllyuiuae".

public class VowelsToEnd1 {
    public static void main(String[] args){
        System.out.println(vowelsToEnd("beautiful"));
    }
    public static String vowelsToEnd(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            char first = s.charAt(0);
            String rest = s.substring(1);
            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                System.out.println("OR stmt - first: " + first + "rest: " + rest);
                return vowelsToEnd(rest) + first;
            } else {
                System.out.println("ELSE stmt - first: " + first + "rest: " + rest);
                return first + vowelsToEnd(rest);
            }
        }
    }
}
