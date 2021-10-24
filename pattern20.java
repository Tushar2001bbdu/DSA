package pepCoding;

import java.util.Scanner;

public class pattern20 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a; j++) {

                if (i < a / 2) {
                    if (j == 0 || j == a - 1) {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
//                else if (i == a / 2) {
//                    if (j == 0 || j == a / 2 || j == a - 1) {
//                        System.out.print("*\t");
//                    }
//                }
                else {
                    if (j == 0 || j == i || i + j ==a-1|| j == a - 1) {
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();

        }
    }
}
