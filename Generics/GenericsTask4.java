package Generics;
//Write a generic method that counts how many times a given element appears in a list.

import java.util.Arrays;
import java.util.List;

public class GenericsTask4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,1,2,3,4,5);
        count(list,1);
    }
    public static <T> void count(List<T> list, T element){
        int count = 0;
        for(T item : list){
            if(item.equals(element)){
                count++;
            }
        }
        System.out.println(count);
    }
}
