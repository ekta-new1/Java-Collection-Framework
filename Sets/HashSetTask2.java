package Sets;

import java.util.*;
//Find first element that repeats.










public class HashSetTask2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("First repeating: " + num);
                return;
            }
            set.add(num);
        }

        System.out.println("No repeating element");
    }
}
