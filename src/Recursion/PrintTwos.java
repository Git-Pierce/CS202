package Recursion;

public class PrintTwos {
    public static void main(String[] args) {
        printTwo(80);
        System.out.println();
        printTwo(20);
        System.out.println();
        printTwo(5);
        System.out.println();
        printTwo(96);
        System.out.println();
        printTwo(2);
        System.out.println();
        printTwo(14);
        //System.out.println(printTwo(5));
        //System.out.println(printTwo(96));
        //System.out.println(printTwo(1));
    }

    public static void printTwo(int anum) {
        if (anum <= 1) {
            throw new IllegalArgumentException("Error - number should be >1" + anum);
        }
        else if (anum % 4 == 0) {
            System.out.print("2 * " );
            printTwo(anum /4 );
            System.out.print( " * 2");

        }
        else if (anum % 2 == 0){
            System.out.print("2 * " + anum/2);
        }
        else {
            System.out.print(anum);
        }
    }
}

