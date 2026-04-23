package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

//PriorityQueue: A queue where elements are processed according to their priority instead of insertion order.
//The highest priority element is always removed first
//Priority Queue → Smallest element (or highest priority) comes first
//Imagine a hospital emergency room:
//Critical patient → treated first
//Normal patient → waits
//Uses a Min Heap (Binary Heap)
//Root = smallest element
//Not fully sorted!

public class PriorityQueueNotes {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();  // Here Queue is interface and PriorityQueue is class
        q.add(78);
        q.add(33);
        q.add(89);
        q.offer(61);   //add and offer both works same for priority queue.
        // The difference is visible in ArrayBlocking Queue(which is not in your syllabus)
        // add() Throws an exception (IllegalStateException) when queue is full and trying to add extra element
        // offer() does NOT throw exception when adding extra element after queue is full, instead it returns false (so safe to use)

        System.out.println(q);
        //prints output based on min-heap(not fully sorted, only first element will be smallest)


        while (!q.isEmpty()){
            System.out.println(q.poll());  //Removes + returns smallest element
        }
    }
}

