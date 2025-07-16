import java.util.*;

public class CustomCollectionsLinkedList {
    public static void main(String[] args) {
        // Linked List
        /*
        LinkedList is a doubly linked list implementation of the List interface.
        It provides fast insertions and deletions but slower random access compared to ArrayList.
        By using linked list we can insert the values from both sides in the array
         */
        LinkedList<Integer> li = new LinkedList<>();
        li.add(25);
        li.add(2);
        li.addFirst(3);
        li.addLast(45);
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
    }
}
