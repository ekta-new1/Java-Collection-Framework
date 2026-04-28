package Sets;

import java.util.*;
//longest consecutive sequence length
//[100, 4, 200, 1, 3, 2]
//output - 4
//Explanation - The longest consecutive sequence is 1,2,3,4 here
//so total length is 4 here
public class HashSetTask1 {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSequence(arr)); // 4
    }

    public static int longestSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : set) {
            //Is this number the start of a sequence?
            // If (num - 1) is NOT present → start of the sequence
            // If present → skip
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                //does next element exists?
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
