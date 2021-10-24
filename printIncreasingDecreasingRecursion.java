package pepCoding;

import java.util.Scanner;

public class printIncreasingDecreasingRecursion {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        pdi(a);

    }

    public static void pdi(int n){
        System.out.println(n);
        if(n>1){
            pdi(n-1);
        }
        System.out.println(n);
    }

}
