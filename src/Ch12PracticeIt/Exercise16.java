package Ch12PracticeIt;
//Write a method evenDigits that accepts an integer parameter n and that returns the integer formed by
//        removing the odd digits from n. The following table shows several calls and their expected return values:
//
//        Call	Valued Returned
//        evenDigits(8342116);	8426
//        evenDigits(4109);	40
//        evenDigits(8);	8
//        evenDigits(-34512);	-42
//        evenDigits(-163505);	-60
//        evenDigits(3052);	2
//        evenDigits(7010496);	46
//        evenDigits(35179);	0
//        evenDigits(5307);	0
//        evenDigits(7);	0
//        If a negative number with even digits other than 0 is passed to the method,
//        the result should also be negative, as shown above when -34512 is passed.
//        Leading zeros in the result should be ignored and if there are no even digits other than 0 in the number, the method should return 0, as shown in the last three outputs.
//  Test Github
public class Exercise16 {
    public static void main(String[] args){

        int n = evenDigits(220);
        System.out.println("Even digits in number " + n);
    }
    public static int evenDigits(int n) {
        if (n < 0) {
            return -evenDigits(-n);
        } else if (n == 0) {
            return 0;
        } else if (n % 2 == 0) { //even value
            System.out.println("n:" + n + ", n/10: " + n/10 + ", n % 10: " + n% 10);
            return 10 * evenDigits(n / 10) + n % 10;
        } else {
            return evenDigits(n / 10);
        }
    }
}

