package Recursion;

public class WriteStars {
    public static void main(String[] args){
        writeStars(4);
        writeStars(10);
        writeLoopStars(4);
    }

    public static void writeLoopStars(int astar){
        for (int i = 1; i <= astar; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void writeStars(int anum){
        if (anum == 0){
            System.out.println();
        }
        else{
            System.out.print("*");
            writeStars(anum -1);
           // System.out.println();
        }
    }
}
