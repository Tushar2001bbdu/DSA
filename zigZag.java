package pepCoding;

import java.util.Scanner;

public class zigZag {

    public static int function2(int[] arr, int i) {
        if (i == arr.length-1) {
            return arr[i];
        }

        int max = function2(arr, i + 1);
        max = arr[i] > max ? arr[i] : max;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = function2(a, 0);
    }
}
