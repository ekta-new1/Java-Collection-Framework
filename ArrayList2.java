import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
//count frequency of each element in arraylist
public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,10,20,30,30,30));
    ArrayList<Integer> temp=new ArrayList<>(list);
    ArrayList<String> ans=new ArrayList<>();
    for(int i=0;i<temp.size();i++){
        int count=1;
        for(int j=i+1;j<temp.size();j++){
            if(temp.get(i)==temp.get(j)){
                count++;
                temp.remove(j);
            }

        }
        String str=(temp.get(i))+"->"+(count);
        ans.add(str);
    }
    System.out.println(ans);


    }
}
