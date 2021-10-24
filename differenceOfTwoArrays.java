package pepCoding;

import java.util.Scanner;

public class differenceOfTwoArrays {
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
        while (d2 >= 0) {
            ans[i] = 0;
            ans[i] = ans[i] + c;

            ans[i] = ans[i] + b[d2];

            int a1v;
            if(d1<0){
                a1v = 0;
            } else{
                a1v = a[d1];
            }


            if (ans[i] >= a1v) {
                ans[i] = ans[i] - a1v;
                c = 0;
            } else {

                ans[i] = ans[i] + 10 - a1v;
                c = -1;
            }

            d1--;
            d2--;
            i--;
        }


        int idx = 0;
        while (idx < ans.length) {
            if (ans[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        for (int an = idx; an < ans.length; an++) {
            System.out.println(ans[an]);

        }


    }
}
