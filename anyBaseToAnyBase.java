package pepCoding;

import java.util.Scanner;

public class anyBaseToAnyBase {
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

    public static int getValueInBase(int n, int b){
        // write code here

        int pow = 1;
        int ans =0;
        while(n>0){
            ans = ((n%b) *pow ) + ans;
            n = n /b;
            pow = pow*10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
       int dec= getValueIndecimal(n, sourceBase);
       int ans = getValueInBase(dec, destBase);
        System.out.println(ans);
    }

}
