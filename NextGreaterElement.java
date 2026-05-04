public class NextGreaterElement {
//12543
//13245
    public static void main(String[] args) {
        String s1 = "12543";
        String s2 = "997";   //-1
        System.out.println(nextGreater(s1));
        System.out.println(nextGreater(s2));
    }

    public static String nextGreater(String num) {
        char[] a = num.toCharArray();  // [1,2,5,4,3]
        int i = a.length - 2;       // i = 3 (i should always be at second last pos)
        while (i >= 0 && a[i] >= a[i + 1]) {   //4>=3 yes   (decides from which i pos, swaping will start)
            i--;   //i=1
        }
        if (i < 0) return "-1";
        int j = a.length - 1;       // j = 4 (j is starting from last)
        while (a[j] <= a[i]) { // 3<=2 no
            j--;
        }
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        int l = i + 1;
        int r = a.length - 1;
        while (l < r) {
            char temp2 = a[l];
            a[l] = a[r];
            a[r] = temp2;
            l++;
            r--;
        }
        return new String(a);
    }
}