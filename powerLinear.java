package pepCoding;

import java.util.Scanner;

public class powerLinear {

    public static int recursion(int n, int k){
        if(k == 0){
            return 1;
        }
        int fn = recursion(n,k-1);
        int rt = fn * n;
        return rt;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = recursion(a,b);
        System.out.println(ans);
    }
}
