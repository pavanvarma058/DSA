import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        // Pattern 18
        // input:- 5
        /*
        E
        D E
        C D E
        B C D E
        A B C D E
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(char ch = (char)(('A'+n-1)-i); ch<='A'+n-1; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
