package pepCoding;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int n=a;
        int ans;

        while(n>0){
            ans = n%10;
            System.out.println(ans);
            n = n/10;
        }
    }
}
