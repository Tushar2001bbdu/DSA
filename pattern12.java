package pepCoding;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int x = 0;
        int y = 1;

        for (int i = 0; i < a; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(x + "\t");
                int z = x + y;
                x = y;
                y = z;

            }
            System.out.println();
        }
    }
}
