import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        // Pattern 17
        // input:- 5
        /*
        A
       ABA
      ABCBA
     ABCDCBA
    ABCDEDCBA
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(' ');
            }

            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }

            for(int j=0; j<n-i-1; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
