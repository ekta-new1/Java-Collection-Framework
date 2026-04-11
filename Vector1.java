import java.util.Arrays;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
// Vector is thread safe, it is used when we want to ensure thread safety so it is slow.
// If you want fast access to elements and no thread safety, then go for arraylist.
//If you want frequent insertion/deletion(modifications), then use LinkedList.

        Vector<Integer> v = new Vector<>(Arrays.asList(10,30,30,393,37));
        v.add(10);
        v.add(20);
        System.out.println(v.capacity());
        v.add(30);
        v.add(40);
        System.out.println(v.capacity());
        v.add(3);
        v.add(5);
        System.out.println(v.capacity());

    }
}
