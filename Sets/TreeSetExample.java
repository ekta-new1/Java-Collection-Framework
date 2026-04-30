package Sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements (required to demonstrate functions)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("TreeSet: " + set);

        // first() -> returns the smallest (first) element
        System.out.println("First element: " + set.first());

        // last() -> returns the largest (last) element
        System.out.println("Last element: " + set.last());

        // higher(x) -> returns element strictly greater than x
        System.out.println("Higher than 20: " + set.higher(20));

        // lower(x) -> returns element strictly smaller than x
        System.out.println("Lower than 30: " + set.lower(30));

        // ceiling(x) -> returns equal or bigger element
        System.out.println("Ceiling of 25: " + set.ceiling(25));

        // floor(x) -> returns equal or smaller element
        System.out.println("Floor of 25: " + set.floor(25));

        // pollFirst() -> removes and returns the first (smallest) element
        System.out.println("Poll First: " + set.pollFirst());

        // pollLast() -> removes and returns the last (largest) element
        System.out.println("Poll Last: " + set.pollLast());

        System.out.println("After polling: " + set);

        // Add elements again for subset operations
        set.add(10);
        set.add(50);

        System.out.println("Updated Set: " + set);

        // subSet(a, b) -> returns elements from a (inclusive) to b (exclusive)
        System.out.println("SubSet (20 to 50): " + set.subSet(20, 50));

        // headSet(x) -> returns elements strictly less than x
        System.out.println("HeadSet (<40): " + set.headSet(40));

        // tailSet(x) -> returns elements greater than or equal to x
        System.out.println("TailSet (>=30): " + set.tailSet(30));

        // descendingSet() -> returns elements in reverse (descending) order
        System.out.println("Descending Set: " + set.descendingSet());
    }
}
