package Queue;

import java.util.*;

//Remove adjacent duplicates from string.
// Input: "abbaca"

public class ArrayDequeTask2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
// if same as last → remove (cancel out duplicate)
            if (!dq.isEmpty() && dq.peekLast() == c) {
                dq.pollLast();
            } else {
                dq.offerLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : dq) {
            sb.append(c);
        }
        return sb.toString();
    }
}
