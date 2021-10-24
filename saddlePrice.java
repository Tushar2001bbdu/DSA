package pepCoding;

import java.util.Scanner;

public class saddlePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = rows;
        int[][] a = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int svj;
        for (int i = 0; i < rows; i++) {
            svj = 0;
            for (int j = 0; j < columns; j++) {
                if(a[i][j] < a[i][svj]){
                    svj = j;
                }
            }

            boolean flag = false;
            for(int k = 0;k<columns; k++){
                if(a[k][svj] > a[i][svj]){
                    flag =true;
                    break;
                }
            }
            if(!flag){
                System.out.println(a[i][svj]);
                return;
            }


        }
        System.out.println("Invalid input");

    }
}
