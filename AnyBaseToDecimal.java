package pepCoding;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        // write your code here
 int ans = 0;
 int pow = 1;
        while (n>0){
            ans= ((n%10) * pow) + ans;
            n=n/10;
            pow = pow * b;
        }
        return ans;
    }
}
