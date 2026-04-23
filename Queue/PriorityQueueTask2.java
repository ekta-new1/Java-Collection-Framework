package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTask2 {
//kth largest element -
//Input: [3,2,1,5,6,4], k = 2
// Output: 5
//Explanation - 5 is the second largest element

        public static int findKthLargest(int[] arr, int k) {

            // Min Heap
            Queue<Integer> q = new PriorityQueue<>();

            for (int num : arr) {
                q.add(num);

                // Keep only k elements
                if (q.size() > k) {
                    q.poll(); // remove smallest
                }
            }

            // Top of heap = kth largest
            return q.peek();
        }

        public static void main(String[] args) {
            int[] arr = {3,2,1,5,6,4};
            int k = 2;

            System.out.println(findKthLargest(arr, k));
        }
    }

