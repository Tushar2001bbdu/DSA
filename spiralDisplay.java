package pepCoding;

import java.util.Scanner;

public class spiralDisplay {
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


        int maxc = columns-1;
        int maxr = rows - 1;
        int minr = 0;
        int minc = 0;
        int i,j;

        int total = columns * rows ;
        int n =0;
        while(n < total){

            //left wall
            for(i = minr, j = minc; i<=maxr && n < total; i++){
                System.out.println(a[i][j]);
                n++;
            }
            minc++;

            //bottom wall
            for(i= maxr, j= minc;j<= maxc && n < total; j++){
                System.out.println(a[i][j]);
                n++;
            }


            maxr--;
            for(i=maxr,j=maxc ; i>=minr && n < total;i--){
                System.out.println(a[i][j]);
                n++;
            }
                maxc--;

            for(i= minr, j = maxc; j>= minc && n < total; j--){
                System.out.println(a[i][j]);
                n++;
            }
            minr++;


        }

    }
}
