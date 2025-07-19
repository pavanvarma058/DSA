import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        /*
        You are given an integer n. You need to check whether the number is a palindrome number or not.
        Return true if it's a palindrome number, otherwise return false.
        A palindrome number is a number which reads the same both left to right and right to left.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        if(n == 0){
            return true;
        }
        int rev = 0;
        int p = n;
        while(n>0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return p == rev;
    }
}
