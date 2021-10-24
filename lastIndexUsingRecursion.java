package pepCoding;

import java.util.Scanner;

public class lastIndexUsingRecursion {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int ans = lastIndex(a, 0, b);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){

        if(idx ==arr.length){
            return -1;
        }

        int index =-1;
        if(arr[idx] == x){
            index = idx;
        }
        int out = lastIndex(arr, idx +1,x);

        return index > out ? index : out;
    }

}
