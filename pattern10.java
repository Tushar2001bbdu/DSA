package pepCoding;

import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int os = a / 2;
        int is = -1;

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 0; j < is; j++) {
                System.out.print("\t");
            }
            if (i > 0 && i < a - 1) {
                System.out.print("*\t");
            }

            if (i <a / 2) {
                os--;
                is += 2;
            } else {

                os++;
                is -= 2;
            }
            System.out.println();
        }

    }
}
