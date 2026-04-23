package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

//Find K Smallest Elements
//Input: [7, 10, 4, 3, 20, 15], k = 3
//Output: 3 4 7

public class PriorityQueueTask1 {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k =3;
        Queue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        for (int i = 0; i < k; i++) {
            System.out.print(pq.poll() + " ");
        }
    }
}
