package Map;

import java.util.*;

public class TreeMapSpecialFunctions {
    public static void main(String[] args) {
//These functions are only in TreeMap.
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(100, "A");
        map.put(20, "B");
        map.put(300, "C");
        map.put(40, "D");

        System.out.println("TreeMap: " + map);

        // 1. firstKey()
        System.out.println("First Key: " + map.firstKey());

        // 2. lastKey()
        System.out.println("Last Key: " + map.lastKey());

        // 3. higherKey()
        System.out.println("Higher than 20: " + map.higherKey(20));

        // 4. lowerKey()
        System.out.println("Lower than 20: " + map.lowerKey(20));

        // 5. ceilingKey() - equal or greater key
        System.out.println("Ceiling of 25: " + map.ceilingKey(25));

        // 6. floorKey() - equal or lower key
        System.out.println("Floor of 25: " + map.floorKey(25));

        // 7. pollFirstEntry()
        System.out.println("Removed First: " + map.pollFirstEntry());

        // 8. pollLastEntry()
        System.out.println("Removed Last: " + map.pollLastEntry());

        System.out.println("After removals: " + map);
    }
}
