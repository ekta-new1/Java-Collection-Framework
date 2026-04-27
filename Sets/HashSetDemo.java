package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
//insertion order is random
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(26); // duplicate, will not be added

        System.out.println("After adding elements: " + set);

        System.out.println("Size: " + set.size());

        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 50? " + set.contains(50));

        set.remove(20);
        System.out.println("After removing 20: " + set);

        System.out.println("Is set empty? " + set.isEmpty());

        // Iteration using for-each loop
        System.out.println("Iterating using for-each:");
        for (int num : set) {
            System.out.println(num);
        }

        set.clear();
        System.out.println("After clear(): " + set);

        // addAll() - Combine two sets
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);

        set1.addAll(set2);
        System.out.println("After addAll(): " + set1);

        // removeAll() - Remove common elements from set1 here
        set1.removeAll(set2);
        System.out.println("After removeAll(): " + set1);

        // retainAll() - Keep only common elements
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(5);
        set3.add(6);
        set3.add(7);

        HashSet<Integer> set4 = new HashSet<>();
        set4.add(6);
        set4.add(7);
        set4.add(8);

        set3.retainAll(set4);
        System.out.println("After retainAll(): " + set3);
    }
}
