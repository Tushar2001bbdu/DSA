package pepCoding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class probability {

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[2];

        Scanner scanner = new Scanner(System.in);

        String s[] = scanner.nextLine().split(" ");


        int num = nCr(4, Integer.parseInt(s[1])) * nCr(4, (Integer.parseInt(s[0]) - Integer.parseInt(s[1])));
        int den = nCr(8, Integer.parseInt(s[0]));

        System.out.println((num * 100) / den);

    }


}
