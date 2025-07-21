import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        /*
        You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of
        the two given numbers. Return the LCM of the two numbers.

        The Lowest Common Multiple (LCM) of two integers
        is the lowest positive integer that is divisible by both the integers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number2: ");
        int n2 = sc.nextInt();
        System.out.println(lcmOfTwo(n1, n2));
    }
    public static int lcmOfTwo(int n1, int n2){
        int lcm;
        int i = 1;
        int maxNum = Math.max(n1, n2);
        while (true){
            int multiple = i * maxNum;
            if(multiple%n1 == 0 && multiple%n2 == 0){
                lcm = multiple;
                break;
            }
            i = i + 1;
        }
        return lcm;
    }

    // Another method to solve
    /*
    private int GCD(int n1, int n2){
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
    public int lcm(int n1, int n2) {
        int multiple = n1 * n2;
        int g = GCD(n1, n2);
        return multiple/g;
    }
    */
}
