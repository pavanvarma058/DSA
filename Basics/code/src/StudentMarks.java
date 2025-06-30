import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        /*
        Given the marks of a student, tell us the grade he is getting from the following:
        - Grade A (>=90)
        - Grade B (>= 70 and < 90)
        - Grade C (>= 50 and < 70)
        - Grade D (>= 35 and < 50)
        - Fail (< 35)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        
        if(marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
