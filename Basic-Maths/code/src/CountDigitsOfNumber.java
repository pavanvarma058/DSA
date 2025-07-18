import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        // Count all Digits of a number
        /*
        You are given an integer n. You need to return the number of digits in the number.
        The number will have no leading zeroes, except when the number is 0 itself.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }

    public static int countDigits(int n){
        if(n==0){
            return 1;
        }
        int count = 0;
        while(n>0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
