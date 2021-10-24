package pepCoding;

import java.util.Scanner;

public class printDecreasingRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        printDecreasing(a);

    }
    public static void printDecreasing(int n){
        System.out.println(n);
        if(n>1){
            printDecreasing(n-1);
        }else{
            return;
        }
    }
}
