package ComparableComparator;

import java.util.*;
//Create Employee class-
//class Employee implements Comparable<Employee>
//variable - int salary
//create parameterized constructor
//Add salaries in arrayList
//Sort salaries in descending order(internally calling compareTo)
//print salaries in descending order

class Employee implements Comparable<Employee> {
    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        return e.salary - this.salary;   //descending
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(50000));
        list.add(new Employee(70000));
        list.add(new Employee(60000));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e.salary);
        }
    }
}
