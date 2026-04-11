import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
//Longest Increasing subsequence in arraylist (HARD)
//for eg - [10,9,2,5,3,7,101,18]
//output - 4
//Explanation -
//2,5,7,101 is the longest increasing subsequence in this arraylist so total 4 elements.


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18)
        );

        ArrayList<Integer> tails = new ArrayList<>();

        for (int num : list) {
            int left = 0;
            int right = tails.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left == tails.size()) {
                tails.add(num);
            } else {
                tails.set(left, num);
            }
        }

        System.out.println("Length of LIS: " + tails.size());
    }

}
