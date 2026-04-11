import java.util.Arrays;
import java.util.LinkedList;
//Task 1 -
//Create linkedlist and swap adjacent nodes with each other -
//for eg - [1,2,3,4,5,6]
//output - [2,1,4,3,6,5]

public class LinkedList1 {

public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,9,11,19));
    int temp;
    for(int i=0;i<list.size()-1;i=i+2){
        temp=list.get(i);
        list.set(i,list.get(i+1));
        list.set(i+1,temp);
    }

    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }

}
}
