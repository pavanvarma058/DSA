import java.util.*;
public class CollectionInterfaceStack {
    public static void main(String[] args) {
        // Stack
        // LIFO Last In First Out
        /*
        Stack is a subclass of Vector that implements a last-in, first-out (LIFO) stack of elements.
        It provides typical stack operations like push() and pop().
         */
        Stack<Integer> s = new Stack<>();
        s.add(24);
        s.add(12);
        s.add(11);
        s.push(22);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}
