package pepCoding;

import java.util.Scanner;

public class inverseOfAnArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            inv[a[i]] = i;
        }
        display(inv);

    }
}
