import java.util.*;
public class ListIterator {
    public static void main(String[] args) {
        // Iterator
        /*
        An Iterator allows you to traverse through a collection.
        ListIterator is a special type of iterator for List collections.
         */
        // List Iterator
        /*
        ListIterator allows bidirectional traversal of a list, i.e., both forward and backward.
         */
        List<Integer> li = new ArrayList<>();
        li.add(20);
        li.add(15);
        li.add(28);
        li.add(29);

        Iterator<Integer> it = li.listIterator();
        while(it.hasNext()){
            Integer num = it.next();
            System.out.println(num);
        }
    }
}
