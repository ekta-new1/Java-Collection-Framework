package Generics;

import java.util.Arrays;
import java.util.List;

// Bounded Type Parameter
//Create a generic class Calculator<T extends Number> with a method:
//double sum(List<T> list)
//that returns the sum of elements.
public class Calculator<T extends Number> {   //Number - Integer, Double, Float, Long

    public double sum(List<T> list){
        double sum = 0.0;
        for(T element:list){
            sum+=element.doubleValue();  //operator overloading not allowed
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator<Double> cal = new Calculator<>();
        List<Double> d = Arrays.asList(2.2,9.6,7.4);
        Calculator<Integer> cal2 = new Calculator<>();
        List<Integer> e = Arrays.asList(2,2,4,5,6,8);
        System.out.println(cal2.sum(e));
    }
}
