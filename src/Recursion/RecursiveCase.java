package Recursion;

public class RecursiveCase {
    public static void main(String[] args) {
        System.out.println(parenthesize("Hello", 5));
        System.out.println(parenthesize("Sharon", 2));
        System.out.println(parenthesize("fun", 0));
        System.out.println(parenthesize("recursion", 1));
        System.out.println(parenthesize("exception", -3));
    }

    public static String parenthesize(String astring, int anum) {
        if (anum < 0) {
            throw new IllegalArgumentException("Error - Use a non-negative number!" + anum);
        } else if (anum == 0) {
            return astring;
        } else {
            return "(" + parenthesize(astring, anum - 1) + ")";
        }

    }
}


