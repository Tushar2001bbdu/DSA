package pepCoding;

import java.util.Scanner;

public class firstIndexUsingRecursion {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int ans = firstIndex(a, 0, b);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr, int idx, int x){

        if(idx ==arr.length){
            return -1;
        }
        int index = firstIndex(arr, idx +1,x);
        if(arr[idx] == x){
            index = idx;
        }
        return index;
    }

}
