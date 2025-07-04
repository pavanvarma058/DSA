import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        // Pattern 4
        // input:- 5
        /*
        1
        22
        333
        444
        55555
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
}
