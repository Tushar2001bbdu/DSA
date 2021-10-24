package pepCoding;

import java.util.Scanner;

public class rotateAnArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        int n=a.length;
        k = k % n;
        if (k < 0) {
            k = k + a.length;
        }

        reverse(a, 0, a.length - k - 1);

        reverse(a, a.length - k, a.length - 1);

        reverse(a, 0, a.length - 1);

    }

    public static void reverse(int[] a, int l, int r) {
        while (l < r) {
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
        int k = sc.nextInt();

        rotate(a, k);

       display(a);
    }
}
