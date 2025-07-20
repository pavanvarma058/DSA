import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        You are given an integer n. You need to check if the number is prime or not.
        Return true if it is a prime number, otherwise return false.
        A prime number is a number which has no divisors except 1 and itself.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPrimeNum(n));
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
    // 2nd method
    public static boolean isPrimeNum(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(i==n/i) count+=1;
                else count+=2;
            }
        }
        return count==2;
    }
}
