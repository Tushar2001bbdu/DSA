package pepCoding;

import java.util.Scanner;

public class theStateOfWakanda2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = rows;
        int a[][] = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < rows; i++) {

            for (int j = 0, k = i; k < columns; j++,k++) {
                System.out.println(a[j][k]);

            }

        }


    }
}
