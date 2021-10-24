package pepCoding;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int initial = 1;
        int spc = n / 2;
        int st = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" " + "\t");
            }
            int temp = initial;
            for(int j = 0; j < st; j++)
            {
                System.out.print(temp + "\t");
                if(j< st/2){
                    temp++;
                }else{
                    temp--;
                }

            }
        if (i < n / 2) {
            spc--;
            st =st + 2;
            initial++;
        } else {
            spc++;
            initial--;
            st =st -2;
        }
        System.out.println();
    }
}
}
