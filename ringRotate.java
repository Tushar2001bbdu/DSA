package pepCoding;

import java.util.Scanner;

public class ringRotate {

    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        if (k < 0) {
            k = k + a.length;
        }

        reverse(a, 0, a.length - k - 1);

        reverse(a, a.length - k, a.length - 1);

        reverse(a, 0, a.length - 1);

    }

    public static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static int[] fillOneDFromShell(int[][] a, int s) {
        int rows = a.length;
        int columns = a[0].length;
        int minr = s - 1;
        int minc = s - 1;
        int maxr = rows - s;
        int maxc = columns - s;

        int i, j;

        int total = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;
        int out[] = new int[total];
        int n = 0;



            //left wall
            for (i = minr, j = minc; i <= maxr && n < total; i++) {
                out[n] = a[i][j];
                n++;
            }
            minc++;

            //bottom wall
            for (i = maxr, j = minc; j <= maxc && n < total; j++) {
                out[n] = a[i][j];
                n++;
            }
            maxr--;

            //right wall
            for (i = maxr, j = maxc; i >= minr && n < total; i--) {
                out[n] = a[i][j];
                n++;
            }
            maxc--;


            for (i = minr, j = maxc; j >= minc && n < total; j--) {
                out[n] = a[i][j];
                n++;
            }



        return out;
    }

    public static void fillShellfromOneD(int[][] a,int s, int[] out){
        int rows = a.length;
        int columns = a[0].length;
        int minr = s - 1;
        int minc = s - 1;
        int maxr = rows - s;
        int maxc = columns - s;

        int i, j;

        int total = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;

        int n = 0;



            //left wall
            for (i = minr, j = minc; i <= maxr && n < total; i++) {
                  a[i][j] = out[n];
                n++;
            }
            minc++;

            //bottom wall
            for (i = maxr, j = minc; j <= maxc && n < total; j++) {
                a[i][j]= out[n];
                n++;
            }
            maxr--;

            //right wall
            for (i = maxr, j = maxc; i >= minr && n < total; i--) {
                a[i][j] = out[n];
                n++;
            }
            maxc--;


            for (i = minr, j = maxc; j >= minc && n < total; j--) {
                a[i][j] = out[n];
                n++;
            }


    }
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

        int s = sc.nextInt();
        int r = sc.nextInt();


        int[] out = fillOneDFromShell(a, s);

        //rotate the array
        rotate(out, r);

        fillShellfromOneD(a, s , out);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
