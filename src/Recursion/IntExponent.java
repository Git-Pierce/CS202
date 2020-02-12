package Recursion;

public class IntExponent {
    public static void main(String[] args){
        int value = findExponent(2, 10);
        System.out.println("Integer exponent of 2 to power of 10 :"  + " " + value);
    }

    public static int findExponent(int anum, int powery){
        if (powery < 0){
            throw new IllegalArgumentException("Error: exponent cannot be less than 0" + powery);
        }
        else if (powery == 0){
            return 1;
        }
        else if (powery % 2 == 0){  //even number more efficient
            return findExponent(anum * anum, powery/2);
        }
        else {
            return anum * findExponent(anum, powery - 1);
        }
    }
}
