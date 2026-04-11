public class demo {
    //Question 1 - reverse linkedlist

//Question 2 - Swap k-th Nodes in Linked List
//for eg - [10,20,30,40,50], k = 2
//output - [10,40,30,20,50]
//Explanation - swap 2nd node from start and end with each other

//Question 3 - Swap every two adjacent nodes
//for eg - [1,2,3,4,5,6]
//output - [2,1,4,3,6,5]

//Question4
//for eg - [1,2,3,4,5,6], k = 2
//output - [2,1,3,4,6,5]
//explanation - reverse adjacent nodes after skipping 2 nodes in between(k=2)







public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int k = 2;

    for (int i = 0; i < arr.length; i += 2 * k) {

        int left = i;
        int right = Math.min(i + k - 1, arr.length - 1);

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Print result
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}
