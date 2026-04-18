package Generics;

//Create a generic method to swap two elements in an array.
public class GenericsTask3 {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,2,3,4};
        swap(a,0,1);
        String[] b = new String[]{"hi","work"};
        swap(b,0,1);
    }
    public static <T> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        for(T element : arr) {
            System.out.println(element);
        }
    }
}
