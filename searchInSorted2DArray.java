package pepCoding;

import java.util.Scanner;

public class searchInSorted2DArray {
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
        int n = sc.nextInt();

        int i =0, j = columns-1;
        int posr =-1,posc= -1;
        while(j>0 && i<rows){
            System.out.println("$" + i + " " + j);
            if(a[i][j] == n){
                posr = i;
                posc = j;
                break;
            }
            else if(n > a[i][j]){
                i++;
            }
            else{
                j--;
            }

        }
        if(posr ==-1){
            System.out.println("Not Found");
        }else{
            System.out.println(posr);
            System.out.println(posc);
        }
    }
}
