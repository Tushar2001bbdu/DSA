package pepCoding;

import java.util.Scanner;

public class reverseANumber2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int n=a;
        int ans = 0;

        while(n!=0){
            int m  = n%10;
            ans = ans * 10 + m;
            n = n/10;
        }
        System.out.println(ans);
    }
}
