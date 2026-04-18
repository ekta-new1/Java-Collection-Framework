package Generics;

//Write a generic method that prints elements of any array.
public class GenericsTask2 {
    public static void main(String[] args) {
        String[] a1 = new String[]{"hi", "world"};
        print(a1);
        Integer[] a2 = new Integer[]{1,2,3};
        print(a2);
    }
    //generic function that can accept array of any type
    public static <T> void print(T[] arr){
        for(T element : arr){
            System.out.println(element);
        }
    }
}
