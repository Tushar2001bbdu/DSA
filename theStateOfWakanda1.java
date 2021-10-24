package pepCoding;

import java.util.Scanner;

public class theStateOfWakanda1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int a[][] = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }



        for (int i = 0; i < columns; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < rows; j++) {
                    System.out.println(a[j][i]);
                }
            } else {
                for (int j = rows - 1; j >= 0; j--) {
                    System.out.println(a[j][i]);
                }


            }
        }
    }
}
