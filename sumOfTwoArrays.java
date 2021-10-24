package pepCoding;

import java.util.Scanner;

public class sumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int d1 = a.length - 1;
        int d2 = b.length - 1;
        int c = 0;
        int[] ans = new int[n > n2 ? n : n2];
        int i = ans.length - 1;
        while (d1 >= 0 || d2 >= 0) {
            ans[i] = 0;
            ans[i] = ans[i] + c;
            if (d1 >= 0) {
                ans[i] = ans[i] + a[d1];
            }
            if (d2 >= 0) {
                ans[i] = ans[i] + b[d2];
            }
            if (ans[i] > 9) {
                c = ans[i] / 10;
                ans[i] = ans[i] % 10;
            } else {
                c = 0;
            }
            d1--;
            d2--;
            i--;
        }
        for (int an : ans) {
            System.out.println(an);

        }
        if (c > 0) {
            System.out.println(c);
            ;
        }

    }
}
