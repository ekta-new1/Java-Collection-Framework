import java.util.*;

public class Vector2 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(40);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector: " + v);

        System.out.println("Size: " + v.size());

        System.out.println("Capacity: " + v.capacity());

        System.out.println("Element at index 1: " + v.get(1));

        v.set(1, 25);
        System.out.println("After set: " + v);

        v.remove(2);
        System.out.println("After remove index 2: " + v);

        v.removeElement(40);
        System.out.println("After removeElement(40): " + v);

        System.out.println("Contains 10? " + v.contains(10));

        System.out.println("Index of 10: " + v.indexOf(10));

        System.out.println("First element: " + v.firstElement());

        System.out.println("Last element: " + v.lastElement());

        System.out.println("Is empty? " + v.isEmpty());

        Vector<Integer> v2 = (Vector<Integer>) v.clone();
        System.out.println("Cloned Vector: " + v2);

        v2.clear();
        System.out.println("After clear(): " + v2);

    }
}