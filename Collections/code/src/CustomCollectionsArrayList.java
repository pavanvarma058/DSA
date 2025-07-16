import java.util.*;

public class CustomCollectionsArrayList {
    public static void main(String[] args) {
        // Custom Collections
        // ArrayList
        /*
        An ArrayList is a resizable array implementation of the List interface.
        It offers fast random access but slower insertions and deletions as elements need to be shifted.
         */
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(20);
        arrList.add(16);
        arrList.add(24);
        arrList.add(33);
        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.println(arrList.get(3));
        System.out.println(arrList.remove(2));
        arrList.add(2, 28);
        System.out.println(arrList);
        System.out.println(arrList.contains(28));
    }
}
