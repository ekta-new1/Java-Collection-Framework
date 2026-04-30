package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
// You can change this to HashMap / LinkedHashMap / TreeMap
//All these functions are common in all three map classes.
        Map<String, Integer> map = new HashMap<>();

        // 1. put() → insert data
        map.put("John", 90);
        map.put("Sam", 70);
        map.put("Kevin", 80);
        System.out.println(map);
        // 2. put() → update value
//If same key comes again → value gets updated
        map.put("John", 95);
        System.out.println(map);
        // 3. get(key) → fetch value
        System.out.println("Marks of John: " + map.get("John"));

        // 4. containsKey()
        System.out.println("Has Sam? " + map.containsKey("Sam"));

        // 5. containsValue()
        System.out.println("Has value 80? " + map.containsValue(80));

        // 6. size()
        System.out.println("Size: " + map.size());

        // 7. isEmpty()
        System.out.println("Is empty? " + map.isEmpty());

        // 8. keySet() → print all keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 9. values() → print all values
        for (Integer val : map.values()) {
            System.out.println(val);
        }

        // 10. entrySet() - BEST way to iterate
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 11. remove()
        map.remove("Sam");

        System.out.println("\nAfter removing Riya:");
        System.out.println(map);
    }

}
