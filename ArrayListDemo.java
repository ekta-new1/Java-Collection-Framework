import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println("After adding: " + list);   //[10,20,30,30]

        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(30));

        List<Integer> subList = list.subList(0, 2);
        System.out.println(subList);

        list.add(1, 15);
        System.out.println("After adding at index 1: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 25);
        System.out.println("After updating index 2: " + list);

        list.remove(1);
        System.out.println("After removing index 1: " + list);

        System.out.println("Size of list: " + list.size());

        System.out.println("Contains 25? " + list.contains(25));

        System.out.print("Elements: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("After sorting: " + list);

        list.clear();
        System.out.println("After clearing: " + list);

        System.out.println("Is list empty? " + list.isEmpty());
    }
}
//For practicising more questions -
// https://javaconceptoftheday.com/java-arraylist-programming-examples/