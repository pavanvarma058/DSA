import java.util.*;
public class CollectionInterfaceTreeSet {
    public static void main(String[] args) {
        // Tree Set
        /*
        TreeSet is an implementation of the Set interface that stores elements in a sorted order using a red-black tree.
        The elements are sorted based on their natural ordering or a custom comparator.
         */
        // DS that stores unique elements in sorted order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(5);
        ts.add(0);
        ts.add(1);
        ts.add(-1);
        for(var num:ts){
            System.out.println(num);
        }
        System.out.println(ts.floor(8)); // <=8
        System.out.println(ts.ceiling(8)); // >=8
    }
}
