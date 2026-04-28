package Queue;
import java.util.*;
public class PriorityQueueDemo {

        public static void main(String[] args) {
            // Create PriorityQueue
            Queue<String> pq = new PriorityQueue<>();
            // add() / offer()
            pq.add("banana");
            pq.offer("apple");
            pq.add("cat");
            pq.offer("ball");
            //apple,ball,cat,banana
//Uses min-heap internally(a is considered smallest and z largest)                

            System.out.println("Initial Queue (not sorted): " + pq);

            // peek() → view smallest element
            System.out.println("Peek (smallest): " + pq.peek());

            // contains()
            System.out.println("Contains 'apple'? " + pq.contains("apple"));

            // size()
            System.out.println("Size: " + pq.size());

            // remove(Object)
            pq.remove("cat");
            System.out.println("After removing 'cat': " + pq);

            // poll() - Removes + returns smallest element
            System.out.println("Polling elements (sorted order):");
            while (!pq.isEmpty()) {
                System.out.println(pq.poll());
            }

            // isEmpty()
            System.out.println("Is queue empty? " + pq.isEmpty());

            // Custom Priority (Max Heap)
            Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            maxHeap.add(10);
            maxHeap.add(50);
            maxHeap.add(20);

            System.out.println("Max Heap Polling:");
            while (!maxHeap.isEmpty()) {
                System.out.println(maxHeap.poll());
            }
        }
    }

