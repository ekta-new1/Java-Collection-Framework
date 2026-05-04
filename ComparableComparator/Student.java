package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
//Comparable is an interface in Java that is used to define the natural ordering of objects.
//It is inside: java.lang.Comparable
//Class itself defines how objects should be compared
//Sorting logic is written inside the class

//Comparable allows a class to define its natural ordering using compareTo(), which is used by Collections.sort() to sort objects.
class Student implements Comparable<Student> {  //Student objects can be compared with other Student objects
    int marks;     //Instance variable (belongs to each object)

    Student(int marks) {              //Constructor is called when object is created
        this.marks = marks;           // this.marks → current object's variable
    }                                 //  marks → parameter passed

    public int compareTo(Student s) {
        return this.marks - s.marks;
        // this → current object (from list),
        // s → object being compared with
        // positive - swaping
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(90));  //Memory is allocated for a Student object, Constructor is called.
        list.add(new Student(70));
        list.add(new Student(80));
        //[90,70,80]
        //[70,90,80]
        Collections.sort(list);            //It repeatedly calls: compareTo()

        for (Student s : list) {
            System.out.println(s.marks);
        }
    }
}

