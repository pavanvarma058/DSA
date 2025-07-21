import java.util.Scanner;

public class CountOfPrimeNumbers {
    public static void main(String[] args) {
        /*
        You are given an integer n. You need to find out the number of prime numbers
        in the range [1, n] (inclusive).
        Return the number of prime numbers in the range.
         prime number is a number which has no divisors except, 1 and itself.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(primeUptoN(n));
    }
    public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int primeUptoN(int n){
        int count = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}
