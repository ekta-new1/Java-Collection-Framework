public class Array4 {
//[1,2,3]
// 123 + 1 = 124
//[8,8,8]
// 888 + 1 = 889
    public static void main(String[] args) {
        int[] arr = {1,2,9};
        int multi = 1;
        int ans = 0;
        for(int i=arr.length-1;i>=0;i--){
            ans += arr[i]*multi;
            multi=multi*10;
        }
        System.out.println(ans+1);
    }
}




