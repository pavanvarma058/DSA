import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        /*
        You are given two integers n1 and n2.
        You need find the Greatest Common Divisor (GCD) of the two given numbers.
        Return the GCD of the two numbers.
        The Greatest Common Divisor (GCD) of two integers is the largest
        positive integer that divides both of the integers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number2: ");
        int n2 = sc.nextInt();
        System.out.println(GCD(n1, n2));
    }
    public static int GCD(int n1, int n2){
        // Using Euclidean algorithm
        while (n1!=0 && n2!=0){
            if(n1>n2){
                n1 = n1%n2;
            }else {
                n2 = n2%n1;
            }
        }
        if(n2==0) return n1;
        else return n2;
    }
}
