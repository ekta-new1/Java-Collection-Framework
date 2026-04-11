import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList4 {
//Task 4 - Start swaping 2 adjacent nodes and then skip k nodes then again swap 2 adjacent nodes and so on
// for eg - [1,2,3,4,5,6,7], k = 3
//output - [2,1,3,4,5,7,6]
//explanation - reverse adjacent nodes and then skip 3 nodes in between(k=3)
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
        int k = 3;
        int n = list.size();
        int left = 0;
        int right = 0;
        for(int i = 0;i<n-1;i+=k){
            left = i;
            right = i+1;
            int temp = list.get(right);
            list.set(right,list.get(left));
            list.set(left,temp);
            i+=2;
        }
        for(int i = 0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}
