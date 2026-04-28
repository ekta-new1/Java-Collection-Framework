package Queue;

//Check if Array is a Palindrome using Deque
import java.util.*;

public class ArrayDequeTask1 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,3,2,1};
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int[] arr) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int num : arr) {
            dq.addLast(num);
        }

        while (dq.size() > 1) {
            if (!dq.pollFirst().equals(dq.pollLast())) {
                return false;
            }
        }
        return true;
    }
}