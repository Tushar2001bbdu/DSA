package pepCoding;

import java.util.Scanner;

public class powerLogarithmicRecursion {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xpb2 = power(x, n / 2);
        int xpn = xpb2 * xpb2;

        if (n % 2 == 1) {
            xpn = xpn * x;
        }

        return xpn;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = power(a, b);
        System.out.println(ans);
    }
}
