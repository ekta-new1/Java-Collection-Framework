package Sets;

import java.util.*;

//Longest Substring Without Repeating Characters (Ordered Window)
//Find the length of the longest substring with no repeating characters.

//Input: "abcabcbb"
//Output: 3
// Explanation - abc is the longest substring whose length is 3 so output is 3.

public class LinkedHashSetTask1 {
    public static void main(String[] args) {
        String s = "abccaab";
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, set.size());
        }

        System.out.println("Longest length: " + maxLength);
    }
}
