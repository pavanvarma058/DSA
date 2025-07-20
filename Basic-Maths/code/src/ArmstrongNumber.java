import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
        You are given an integer n.
        You need to check whether it is an armstrong number or not.
        Return true if it is an armstrong number, otherwise return false.

        An armstrong number is a number which is equal to the sum of the digits of the number,
        raised to the power of the number of digits.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        int num = n;
        // initialize sum
        int sum = 0;
        // count no.of digits
        int count = countDigits(n);
        while(n>0){
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, count);
            n = n / 10;
        }
        return num == sum;
    }
    public static int countDigits(int n){
        int count = (int) (Math.log10(n)+1);
        return count;
    }
}
