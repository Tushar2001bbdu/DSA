package pepCoding;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int y = 0;
        for (int i = 0; i < a; i++) {
            int x = 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(x + "\t");

                x = (x * (y - j)) / (j + 1);
            }
            y++;
            System.out.println();
        }
    }
}
