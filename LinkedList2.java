import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList2 {
    // Task 2 - Swap k-th Nodes in Linked List
//for eg - [10,20,30,40,50], k = 2
//output - [10,40,30,20,50]
//Explanation - swap 2nd node(k=2) from start and end with each other
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        int k =1;
        int n = list.size();
        if(k>n)
            return;
        int temp = list.get(k-1);
        list.set(k-1, list.get(n-k));
        list.set(n-k,temp);
        System.out.println(list);
    }
}
