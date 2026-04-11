import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList3 {
//TASK 3 - swap every two adjacent nodes
//[10,20,30,40,50,60]
//[20,10,40,30,60,50]
public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(10,20,30,40,50));
    int k =2;
    for(int i=0;i<l1.size()-1;i+=2){
//        Collections.swap(l1,i,i+1);
//        we can also use this directly but you should also know how to build logic
        int temp = l1.get(i+1);
        l1.set(i+1, l1.get(i));
        l1.set(i, temp);
    }
    System.out.println(l1);
}


}
