import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Reverse a given number
        /*
        You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int revN = 0;
        while(n>0){
            int rem = n % 10;
            revN = revN * 10 + rem;
            n = n / 10;
        }
        return revN;
    }
}
