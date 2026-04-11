import java.util.Arrays;
import java.util.Vector;

public class VectorTask1 {
    //rotating k elements from right side
//[1,2,3,4,5]  , k = 2
//[4,5,1,2,3]
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(10,20,30,40,50));
        int k = 2;
        int n = v.size();

        for (int i = 0; i < k; i++) {
            int last = v.get(n - 1);
            for (int j = n - 1; j > 0; j--) {
                v.set(j, v.get(j - 1));
            }
            v.set(0, last);
        }

        System.out.println(v);
    }
}
