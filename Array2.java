public class Array2 {
    //Task 2 - reverse all the elements of an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


