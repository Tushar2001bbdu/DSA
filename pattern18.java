package pepCoding;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spc = 0;
        int st = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {

                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                if(i> 0 && i< (n/2) && j !=0 && j !=st-1){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*" + "\t");
                }
            }


            if (i < n / 2) {
                spc++;
                st = st - 2;
            } else {
                spc--;
                st = st + 2;

            }
            System.out.println();
        }
    }
}
