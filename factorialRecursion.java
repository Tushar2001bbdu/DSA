package pepCoding;

import java.util.Scanner;

public class factorialRecursion {


    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fn = factorial(n-1);
        int rt = fn * n;
        return rt;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int ans = factorial(a);
        System.out.println(ans);
    }
}
