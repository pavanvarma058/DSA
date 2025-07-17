import java.util.*;
public class CommonAlgorithms {
    public static void main(String[] args) {
        // Common Algorithms in Collection interface
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(3);
        li.add(8);
        li.add(0);
        // sort
        Collections.sort(li);
        System.out.println(li);
        // max & min
        System.out.println(Collections.max(li));
        System.out.println(Collections.min(li));
        // reverse
        Collections.reverse(li);
        System.out.println(li);
        // frequency -> How many times it occurs
        System.out.println(Collections.frequency(li, 5));
        // Math.pow(b, ex)
        int x = (int) Math.pow(2, 5);
        System.out.println(x);

    }
}
