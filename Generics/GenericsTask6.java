package Generics;

import java.util.Arrays;
import java.util.List;

//6. Wildcard Usage (? extends)
//Write a method:
//void printList(List<? extends Number> list)
//that prints elements.
public class GenericsTask6 {
    public static void main(String[] args) {
        printList(Arrays.asList(1,2,3,4,5));
        printList(Arrays.asList(2.4,2.45,6.65,453.5));
        printList(Arrays.asList(1232423133,1311323232,232323111));
    }
    public static void printList(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }
}
