import java.util.*;

public class Divisors {
    public static void main(String[] args) {
        /*
        You are given an integer n. You need to find all the divisors of n.
        Return all the divisors of n as an array or list in a sorted order.
        A number which completely divides another number is called it's divisor.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(divisorsOfNumber(n)));
    }
    public static int[] divisorsOfNumber(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                al.add(i);
            }
        }
        int[] arr = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}
