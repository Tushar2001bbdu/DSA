package pepCoding;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        for(int i=0;i<a;i++){
            if(i<(a/2)+1) {


                for (int j = 0; j < (a / 2) - i; j++) {
                    System.out.print("\t");
                }
                // use for loop where k is less than equal to (2 * i -1)
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*\t"); // print the Star
                }
            }
            else {


                for (int j = 0; j < i - (a / 2); j++) {
                    System.out.print("\t");
                }
                // use for loop where k is less than equal to (2 * i -1)
                for (int k = 0; k < (2*(a-i))-1; k++) {
                    System.out.print("*\t"); // print the Star
                }

            }
            System.out.println();
        }
    }


}
