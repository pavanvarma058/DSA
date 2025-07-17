import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        // Comparator
        List<Integer> li = new ArrayList<>();
        li.add(20);
        li.add(3);
        li.add(11);
        li.add(2);
        // Sort it in descending order
        Collections.sort(li, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<02){
                    return 1;
                }
                else if(o1>o2){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(li);

        // lambda function
        List<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(3);
        al.add(11);
        al.add(2);
        Collections.sort(al, (num1, num2) -> num2 - num1);
        System.out.println(al);
    }
}
