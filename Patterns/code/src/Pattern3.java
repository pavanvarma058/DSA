import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        // Pattern 3
        // input:- 5
        /*
        1
        12
        123
        1234
        12345
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
