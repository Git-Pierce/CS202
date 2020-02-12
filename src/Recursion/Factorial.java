package Recursion;

public class Factorial {
    public static void main(String[] args){
        int anumber = factorial(6);
        System.out.println("Factorial " + anumber);
    }
    public static int factorial(int anum){
        if (anum < 0){
            throw new IllegalArgumentException("Error - need positive number" + anum);
        }
        else if (anum == 0){
            int calcNum = 1;
            return calcNum;
        }
        else {
            System.out.println("Factorial :" + anum );
            return anum * factorial(anum-1);
        }
    }
}
