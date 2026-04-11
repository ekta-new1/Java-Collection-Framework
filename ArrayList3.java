import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
//second largest element of an arraylist
public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(10, 20, 5, 8, 20, 15)
    );
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : list) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    if (secondLargest == Integer.MIN_VALUE) {
        System.out.println("No second largest element (all elements may be same)");
    } else {
        System.out.println("Second Largest: " + secondLargest);
    }
}
}
