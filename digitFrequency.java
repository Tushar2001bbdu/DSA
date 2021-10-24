package pepCoding;

import java.util.Scanner;

public class digitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here+
        int flag =0;
        while(n>0){
            int check =n%10;
            if(check == d){
                flag++;
            }
            n= n/10;
        }
        return(flag);
    }
}
