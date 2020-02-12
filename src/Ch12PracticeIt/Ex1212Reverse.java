package Ch12PracticeIt;
//Write a recursive method isReverse that accepts two strings as a parameter and returns true if the two strings contain the same sequence of characters as each other but in the opposite order
//        (ignoring capitalization), and false otherwise.
//        For example, the string "hello" backwards is "olleh", so a call of isReverse("hello", "olleh") would return true. Since the method is case-insensitive,
//        you would also get a true result from a call of isReverse("Hello", "oLLEh"). The empty string, as well as any one-letter string, is considered to be its own reverse.
//        The string could contain characters other than letters, such as numbers, spaces, or other punctuation; you should treat these like any other character.
//        The key aspect is that the first string has the same sequence of characters as the second string, but in the opposite order, ignoring case. The table below shows more examples:
//
//        Call	Value Returned
//        isReverse("CSE143", "341esc")	true
//        isReverse("Madam", "MaDAm")	true
//        isReverse("Q", "Q")	true
//        isReverse("", "")	true
//        isReverse("e via n", "N aIv E")	true
//        isReverse("Go! Go", "OG !OG")	true
//        isReverse("Obama", "McCain")	false
//        isReverse("banana", "nanaba")	false
//        isReverse("hello!!", "olleh")	false
//        isReverse("", "x")	false
//        isReverse("madam I", "i m adam")	false
//        isReverse("ok", "oko")	false
//        You may assume that the strings passed are not null. You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.)
//        and you may not use any loops to solve this problem; you must use recursion. If you like, you may declare other methods to help you solve this problem, subject to the previous rules.

public class Ex1212Reverse {
    public static void main(String[] args) {
        System.out.println("Madam or MaDAm is: " + isReverse("Madam", "MaDAm"));
    }

    public static boolean isReverse(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        } else if (s1.length() == 0 || s2.length() == 0) {
            return false;  // not same length
        } else {
            String s1first = s1.substring(0, 1);
            System.out.println("Else s1first: " + s1first);

            String s2last = s2.substring(s2.length() - 1);
            System.out.println("Else s2last: " + s2last);

            return s1first.equalsIgnoreCase(s2last) &&
                    isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
        }
    }
}
