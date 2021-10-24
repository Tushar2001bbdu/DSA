package pepCoding;

import java.util.Scanner;

public class digitsOfANumber {



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int a = x;
        int count =0;
        while(a>0){
            count++;
            a = a/10;
        }

        int div = (int)Math.pow(10,count-1);

        while(div!=0){
            System.out.println(x/div);
            x=x%div;
            div=div/10;
        }
//        System.out.println(count);
    }
}
