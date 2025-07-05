import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        // Pattern 12
        // input:- 5
        /*
        1        1
        12      21
        123    321
        1234  4321
        1234554321
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=(2*n)-(2*i); j++){
                System.out.print(' ');
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
