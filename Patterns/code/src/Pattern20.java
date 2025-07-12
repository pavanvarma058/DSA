import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        // Pattern 19
        // input:- 5
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int spaces = 2*n-2;

        // Outer loop to print the row.
        for(int i = 1; i <= 2*n-1; i++){
            // Stars for first half
            int stars = i;

            // Stars for the second half.
            if(i > n) stars = 2*n - i;

            // For printing the stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            // For printing the spaces
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // For printing the stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            // Give a line break for new row.
            System.out.println();

            if(i < n) spaces -= 2;
            else spaces += 2;
        }
    }
}
