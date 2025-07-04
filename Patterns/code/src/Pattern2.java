import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        // Pattern 2
        // input - 5
        /*
         *
         **
         ***
         ****
         *****
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
