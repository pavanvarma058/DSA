import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        // Pattern 9
        // input:- 5
        /*
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(' ');
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(' ');
            }
            for(int j=0; j<(2*n-1)-(2*i); j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
