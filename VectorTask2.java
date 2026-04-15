import java.util.Arrays;
import java.util.Vector;

public class VectorTask2 {
//print first non-repeating element
//[4,5,6,2,1,3,5,4,6]
//Output - 2
// Explanation - 2 is first element which is repeating only one time.

public static void main(String[] args) {
    Vector<Integer> v = new Vector<>(Arrays.asList(4,5,1,2,1,4,5));
    for (int i = 0; i < v.size(); i++) {
        int count = 0;
        for (int j = 0; j < v.size(); j++) {
            if (v.get(i).equals(v.get(j))) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(v.get(i));
            break;
        }
    }
}
}
