import java.util.*;
public class CollectionInterfaceMap {
    public static void main(String[] args) {
        // Map
        /*
        A Map is a collection that maps keys to values.
        It does not allow duplicate keys, but multiple keys can map to the same value.
         */
        // 1) HashMap
        // HashMap is an implementation of the Map interface that uses a hash table for storage.
        // It allows null keys and values.
        // key, value
        // does not store keys in the sorted order
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, "Pavan");
        hm.put(1, "Yeswanth");
        hm.put(4, "Zoro");
        hm.put(3, "Luffy");
        System.out.println(hm);
        System.out.println(hm.get(4));

        // 2) TreeMap
        // Stores in sorted order
        // Does not allow duplicate elements
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(5, "Pavan");
        tm.put(11, "Yeswanth");
        tm.put(4, "Zoro");
        tm.put(13, "Luffy");
        System.out.println(tm);
        System.out.println(tm.floorKey(6));
        System.out.println(tm.ceilingKey(10));
        Set<Integer> st = tm.keySet();
        System.out.println(st);
    }
}
