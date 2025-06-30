import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        /*
        You are given three integers a, b, and c,
        print which of these integers is the largest.
        If two or more integers are equal and are the largest,
        the program should indicate that as well.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter third integer: ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is the largest");
        }else if(b > a && b > c){
            System.out.println("B is the largest");
        }else if (c > a && c > b) {
            System.out.println("C is the largest");
        }else {
            System.out.println("No one is largest");
        }

    }
}
