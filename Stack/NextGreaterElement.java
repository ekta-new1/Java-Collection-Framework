package Stacks;
import java.util.*;
public class NextGreaterElement {
// {4,5,2,10} - input
//{5,10,10,-1} - output
        public static int[] nge(int[] arr) {        //arr = {4,5,2,10}
            int n = arr.length;                     //n=4
            int[] result = new int[n];              // result = [5,10,10,-1]
            Stack<Integer> stack = new Stack<>();    //stack = [10,5]
            for(int i = n - 1; i >= 0; i--) {
                while(!stack.isEmpty() && arr[i] >= stack.peek()) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {4, 5, 2, 10};
            System.out.println(Arrays.toString(nge(arr)));
        }
    }

