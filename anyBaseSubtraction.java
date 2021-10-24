package pepCoding;

import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int c = 0, p = 1;
        int ans = 0;
        while (n2 > 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = c + d2 - d1;
            if (d < 0) {
                d = d + b;
                c = -1;
            } else {
                c = 0;
            }
            ans = ans + d * p;
            p = p * 10;


        }
        return ans;
    }
}
