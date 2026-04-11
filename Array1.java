public class Array1 {
//Task1 - sort array in ascending order without using sort() function
    public static void main(String[] args) {
        int arr[] = {12, 1, 4, 5, 6, 10, 99, 100};

        for(int i=0; i<arr.length - 1; i++) {
            for(int j= i+1; j < arr.length-1; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else {
                    continue;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
