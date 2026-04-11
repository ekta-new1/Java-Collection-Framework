public class Array3 {
// Task 3 - Arrange all the zeroes at the last of an array
//[1,0,2,0,3,4,0]
//[1,2,3,4,0,0,0]
public static void main(String[] args) {
    int[] arr = {1, 0, 2, 0, 3, 4, 0};
    int count = 0;

    for (int i = 0; i < arr.length; i ++) {
        if (arr[i] != 0) {
            arr[count++] = arr[i];
        }
    }

    while (count < arr.length) {
        arr[count++] = 0;
    }

    for (int i =0 ; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
}
