import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        // Pattern 13
        // input:- 5
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // print the count, after that increment it
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
