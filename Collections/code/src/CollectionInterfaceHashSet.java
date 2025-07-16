import java.util.*;
public class CollectionInterfaceHashSet {
    public static void main(String[] args) {
        // HashSet
        // Data Structure that stores unique elements in any random order
        /*
        HashSet is an implementation of the Set interface that uses a hash table for storage.
        It provides constant time performance for basic operations like add and remove.
         */
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(0);
        System.out.println(hs);
        hs.remove(0);
        for(var num: hs){
            System.out.println(num);
        }
    }
}
