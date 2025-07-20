import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        /*
        You are given an integer n. Return the value of n! or n factorial.
        Factorial of a number is the product of all positive integers less than or equal to that number.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n==0) return 1;
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
