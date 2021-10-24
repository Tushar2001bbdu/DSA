package pepCoding;

import java.util.Scanner;

public class matrixMultiplication {
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

        int rows2 = sc.nextInt();
        int columns2 = sc.nextInt();
        int b[][] = new int[rows2][columns2];


        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int ans[][] = new int[rows][columns2];

        if (columns == rows2) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns2; j++) {
                    int temp = 0;
                    for (int k = 0; k < columns; k++) {
                        temp = temp + a[i][k] * b[k][j];
                    }
                    ans[i][j] = temp;
                }
            }

            for (int[] x : ans) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }
    }
}
