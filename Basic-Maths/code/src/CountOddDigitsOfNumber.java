import java.util.Scanner;

public class CountOddDigitsOfNumber {
    public static void main(String[] args) {
        // Count all odd digits of a given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(countOdd(n));
    }
    public static int countOdd(int n){
        if(n == 0){
            return 0;
        }
        int count = 0;
        while(n>0){
            int num = n % 10;
            if(num % 2 != 0) count++;
            n = n / 10;
        }
        return count;
    }
}
