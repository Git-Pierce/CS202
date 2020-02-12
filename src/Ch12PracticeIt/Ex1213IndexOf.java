package Ch12PracticeIt;
//Write a recursive method indexOf that accepts two Strings as parameters and that returns the starting index of the first occurrence of the second String inside the first String (or -1 if not found).
//        The table below lists several calls to your method and their expected return values. Notice that case matters, as in the last example that returns -1.
//
//        Call	Value Returned
//        indexOf("Barack Obama", "Bar")	0
//        indexOf("Barack Obama", "ck")	4
//        indexOf("Barack Obama", "a")	1
//        indexOf("Barack Obama", "McCain")	-1
//        indexOf("Barack Obama", "BAR")	-1
//        Strings have an indexOf method, but you are not allowed to call it. You are limited to these methods:
//
//        Method	Description
//        equals(String other)	returns true if the two Strings contain the same characters
//        length()	returns the int number of characters in the String
//        substring(int fromIndex, int toIndex)
//        substring(int fromIndex)	returns a new String containing the characters from this String from fromIndex (inclusive) to toIndex (exclusive), or to the end of the String if toIndex is omitted
//        You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion.

public class Ex1213IndexOf {
    public static void main(String[] args){
        System.out.println("index value: " + indexOf("President", "res"));
    }
    public static int indexOf(String source, String target) {
        if(target.length() > source.length()) {
            return -1;
        } else if(source.substring(0, target.length()).equals(target)) {
            System.out.println("ELSE IF substring(0, target.length(): " + source.substring(0, target.length()));
            System.out.println("ELSE IF target: " + target);
            return 0;
        } else {
            int pos = indexOf(source.substring(1), target);
            System.out.println("ELSE pos: " + pos);
            if(pos == -1) {
                return -1;
            } else {
                return pos + 1;
            }
        }
    }
}
