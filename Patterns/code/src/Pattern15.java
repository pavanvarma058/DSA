import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        // Pattern 15
        // input:- 5
        /*
        ABCDE
        ABCD
        ABC
        AB
        A
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A'+(n-1-i); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
