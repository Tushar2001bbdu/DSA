package pepCoding;

import java.util.Scanner;

public class pattern5SecondWWay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int space =  a- 1, num = 1;

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("\t"); //print the number
            }
            for (int k = 1; k <= num; k++) {
                System.out.print(" *\t");
            }
            if (space > i) {
                space = space - 1;
                num = num + 2;
            }
            if (space < i) {
                space = space + 1;
                num = num - 2;
            }System.out.println();
        }

    }
}
