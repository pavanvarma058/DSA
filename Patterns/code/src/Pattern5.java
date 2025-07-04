import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        // Pattern 5
        // input:- 5
        /*
         *****
         ****
         ***
         **
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
