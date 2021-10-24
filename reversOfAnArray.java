package pepCoding;

import java.util.Scanner;

public class reversOfAnArray {
    public static void reverse(int[] a){
        // write your code here
        int l=0;
        int r = a.length-1;
        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

    reverse(a);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);;
        }
    }
}
