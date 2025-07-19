import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        // You are given an integer n. Return the largest digit present in the number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(largestDigitInNumber(n));
    }
    public static int largestDigitInNumber(int n) {
        int max = 0;
        while(n>0){
            int rem = n % 10;
            if(rem > max){
                max = rem;
            }
            n = n / 10;
        }
        return max;
    }
}
