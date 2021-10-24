package pepCoding;

import java.util.Scanner;

public class decimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        // write code here

        int pow = 1;
        int ans = 0;
        while (n > 0) {
            ans = ((n % b) * pow) + ans;
            n = n / b;
            pow = pow * 10;
        }
        return ans;
    }

}
