import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList2 {
//count frequency of each element in arraylist
    //[1,1,2,2,2,3]
    //1->2
    //2->3
    //3->1
public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,10,10,20,30));
    for(int i=0;i<list.size();i++){
        int count=1;
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)==list.get(j)){
                count++;
                list.remove(j);
                j--;
            }
        }
        System.out.println((list.get(i))+"->"+(count));
    }
    }
}
