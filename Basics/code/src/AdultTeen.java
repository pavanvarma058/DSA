import java.util.Scanner;

public class AdultTeen {
    public static void main(String[] args) {
        // Given an age, print "Adult" if age >= 18, or print "Teen"
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }else {
            System.out.println("Teen");
        }
    }
}
