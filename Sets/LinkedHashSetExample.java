package Sets;

import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet is a class in Java implemented with the help of Set interface that combines the power of:
//HashSet (fast operations using hashing)
//Doubly LinkedList (maintains insertion order)
//Stores unique elements only

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

//When you add an element:
//Hash is calculated (like in HashSet)
//It goes into a bucket
//Additionally:
//It is linked to previous element using a linked list

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate removed

        System.out.println(set);   //Order is preserved (10 → 20 → 30)
    }
}
