package pepCoding;

import java.util.Scanner;

public class pythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if(max<b){
            max=b;

        }
        if(max<c){
            max=c;
        }

        if(max*max == a*a + b*b  + c*c - max*max){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
