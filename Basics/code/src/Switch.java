import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Given the day number print which day it is of the week,
        // assume week starts from monday and ends on sunday
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-7: ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
