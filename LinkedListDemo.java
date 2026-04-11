import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add(): " + list);

        list.addFirst("Start");
        list.addLast("End");
        list.add(2, "Middle");
        System.out.println("After addFirst, addLast, add(index): " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "Updated");
        System.out.println("After set(): " + list);

        list.remove();
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After removals: " + list);

        System.out.println("Contains 'B'? " + list.contains("B"));
        System.out.println("Index of 'B': " + list.indexOf("B"));

        System.out.println("Size: " + list.size());

        System.out.print("Using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.print("\nUsing for-each loop: ");
        for (String item : list) {
            System.out.print(item + " ");
        }

        list.clear();
        System.out.println("\nAfter clear(): " + list);

        System.out.println("Is list empty? " + list.isEmpty());
    }
}
//link to practice more questions -
//www.w3resource.com/java-exercises/collection/linked-list.php
//coding questions for future interviews and placements -
//https://www.geeksforgeeks.org/dsa/top-50-linked-list-interview-question/