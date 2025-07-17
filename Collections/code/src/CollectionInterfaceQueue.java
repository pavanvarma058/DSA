import java.util.*;

public class CollectionInterfaceQueue {
    public static void main(String[] args) {
        // Queue
        // 1) ArrayDeque
        // FIFO - First In First Out
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // offer -> add
        ad.offer(20);
        ad.offer(15);
        ad.offer(13);
        ad.offer(39);
        System.out.println(ad);
        System.out.println(ad.peek()); // prints first element from the list
        ad.poll(); // removes the first element from the list
        System.out.println(ad);
        System.out.println(ad.peek());
        // other methods -> peekFirst(), peekLast(), offerFirst(), offerLast(), isEmpty()

        // 2) LinkedList -> already learned

        // 3) PriorityQueue
        // Stores Elements
        // and whenever you ask for its peek, it gives you the smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(5);
        pq.offer(0);
        pq.offer(4);
        while(pq.isEmpty() == false){
            System.out.println(pq.peek());
            pq.poll();
        }


    }
}
