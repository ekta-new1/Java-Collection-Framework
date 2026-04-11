import java.util.ArrayList;

public class ArrayList1 {
//removing duplicates from arraylist
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(30);
        for(int i =0 ; i<list.size();i++){
            for(int j =i+1; j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                }
            }
        }
        for(int num : list){
            System.out.println(num);
        }
    }
}
