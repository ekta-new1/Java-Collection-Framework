package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
//Deque(Double-ended queue) is interface
//ArrayDeque is class implemented with the help of Deque interface(which means elements can be added and deleted from both the ends)  
        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements
        dq.addFirst(10);     // [10]
        dq.addLast(20);      // [10, 20]
        dq.offerFirst(5);    // [5, 10, 20]
        dq.offerLast(25);    // [5, 10, 20, 25]

        System.out.println("After adding: " + dq);

        // Accessing elements
        System.out.println("First element (getFirst): " + dq.getFirst()); //5
        System.out.println("Last element (getLast): " + dq.getLast()); //25

        System.out.println("Peek First: " + dq.peekFirst());  //5
        System.out.println("Peek Last: " + dq.peekLast());  //25
//When deque is empty -
//getFirst() & getLast() throws NoSuchElementException
//peekFirst() & peekLast() returns null (so safe to use)

        //  Removing elements
        dq.removeFirst();   // removes 5 → [10, 20, 25]
        dq.removeLast();    // removes 25 → [10, 20]
//If deque is empty → throws NoSuchElementException
        System.out.println("After remove: " + dq);

        dq.pollFirst();     // removes 10 → [20]
        dq.pollLast();      // removes 20 → []
//pollFirst() - Removes element from the front (head) + Returns that element
//pollLast() - Removes element from the rear (tail) + Returns that element
//If deque is empty → returns null (NO exception)

        System.out.println("After poll: " + dq);

        // Stack operations
        dq.push(100);       // [100]
        dq.push(200);       // [200, 100]

        System.out.println("After push: " + dq);

        dq.pop();           // removes 200 → [100]
        System.out.println("After pop: " + dq);

        // Other useful methods
        dq.add(50);         // same as addLast
        dq.offer(60);       // same as offerLast

        System.out.println("Final deque: " + dq);

        System.out.println("Contains 50? " + dq.contains(50));
        System.out.println("Size: " + dq.size());

        dq.clear();
        System.out.println("After clear: " + dq);
    }
}
