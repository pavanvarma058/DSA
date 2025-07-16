import java.util.*;
public class CollectionInterfaceVector {
    public static void main(String[] args) {
        // Vector
        /*
        Vector is similar to ArrayList but is synchronized,
        meaning it is thread-safe for multi-threaded environments.
         */
        Vector<Integer> vec = new Vector<>();
        vec.add(25);
        vec.add(55);
        vec.add(45);
        System.out.println(vec);
    }
}
