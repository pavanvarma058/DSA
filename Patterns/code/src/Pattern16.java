import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        // Pattern 16
        // input:- 5
        /*
        A
        BB
        CCC
        DDDD
        EEEEE
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
