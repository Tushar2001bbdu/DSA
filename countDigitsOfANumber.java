package pepCoding;

import java.util.Scanner;

public class countDigitsOfANumber {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();


    int a = x;
    int count =0;
    while(a>0){
count++;
a = a/10;

    }
        System.out.println(count);
    }
}
