package pepCoding;

import java.util.Scanner;

public class exitPointOfAMatrix {
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

        int dir = 0; // E -, S - 1, W - 2, N - 3
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + a[i][j]) % 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == a.length) {
                j--;
                break;
            } else if (j == a[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
