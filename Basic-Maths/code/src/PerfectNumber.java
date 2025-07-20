import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /*
        You are given an integer n. You need to check if the number is a perfect number or not.
        Return true if it is a perfect number, otherwise, return false.
        A perfect number is a number whose proper divisors (excluding the number itself)
         add up to the number itself.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum == n;
    }
}
