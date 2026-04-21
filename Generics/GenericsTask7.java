package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//7. Wildcard Usage (? super)
//Write a method that adds integers to a list:
//void addNumbers(List<? super Integer> list)
public class GenericsTask7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        addNumbers(list1);
        addNumbers(list2);
    }
    //Lower Bounded Wildcard - <? super Classname>
    // Classname(wrapper class) will accept list of its own class and its parent classes
    public static void addNumbers(List<? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(30);
    }
}

