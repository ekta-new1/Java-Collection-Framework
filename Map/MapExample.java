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

        // put() → insert data
        map.put("John", 90);
        map.put("Sam", 70);
        map.put("Kevin", 80);
        System.out.println(map);
        
        // put() → update value
//If same key comes again → value gets updated
        map.put("John", 95);
        System.out.println(map);
        
        // get(key) → fetch value
        System.out.println("Marks of John: " + map.get("John"));

        //getOrDefault(key, DefaultValue) - returns value of the key if the key exists otherwise it returns defaultValue.
        System.out.println(map.getOrDefault("Sam",0));
        System.out.println(map.getOrDefault("Ekta", 0));

        // containsKey()
        System.out.println("Has Sam? " + map.containsKey("Sam"));

        // containsValue()
        System.out.println("Has value 80? " + map.containsValue(80));

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("Is empty? " + map.isEmpty());

        // keySet() → print all keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // values() → print all values
        for (Integer val : map.values()) {
            System.out.println(val);
        }

        // entrySet() - BEST way to iterate
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // remove()
        map.remove("Sam");

        System.out.println("\nAfter removing Riya:");
        System.out.println(map);
    }

}
