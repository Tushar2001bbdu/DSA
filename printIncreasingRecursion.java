package pepCoding;

import java.util.Scanner;

public class printIncreasingRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        printIncreasing(a);

    }
    public static void printIncreasing(int n){

        if(n>1){
            printIncreasing(n-1);
        }
        System.out.println(n);
    }
}
