import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // Pattern 6
        // input:- 5
        /*
        12345
        1234
        123
        12
        1
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
