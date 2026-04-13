import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList1 {
//removing duplicates from arraylist
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,30,30));
        for(int i =0 ; i<list.size();i++){
            for(int j =i+1; j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }
        for(int num : list){
            System.out.println(num);
        }
    }
}
