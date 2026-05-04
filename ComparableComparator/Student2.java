package ComparableComparator;
//Comparator is an interface used to define custom sorting logic outside a class
//Located in: java.util.Comparator
//Used when:
//You want multiple ways to sort
//You cannot modify the class
//Sorting logic is dynamic
import java.util.*;

public class Student2 {

    int marks;
    String name;

    Student2(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Student2> list = new ArrayList<>();  //ArrayList of objects

        list.add(new Student2(90, "David"));
        list.add(new Student2(80, "Riya"));
        list.add(new Student2(90, "Akash"));
        list.add(new Student2(70, "Rahul"));

        // Comparator (logic is written inline)
        Collections.sort(list, (s1, s2) -> {      //Sort the list using the rule I am giving you,  2nd arg-Comparator (sorting logic)
            if (s1.marks != s2.marks) {
                return s1.marks - s2.marks;   // sort by marks, if positive then swap
            } else {
                return s1.name.compareTo(s2.name); // if marks are same, then decide using name
            }
        });

        for (Student2 s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}