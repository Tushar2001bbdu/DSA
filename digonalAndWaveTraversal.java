package pepCoding;

import java.util.Scanner;

public class digonalAndWaveTraversal {
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
int dir = 1;
        int i = rows-1, j = 0;


        int total = columns * rows ;
        int n =0;
        while(n < total){
            System.out.println(a[i][j]);
            if(dir== 1){

                if(i == rows-1 && n< total/2 ){
                    j++;
                    dir = -1;
                }else if(j == columns-1 && n>= total/2 ){
                    i--;
                    dir = -1;
                }
                else{
                    i++;
                    j++;
                }
            }
            else{
                if(n> total/2 &&  i==0){
                    dir = 1;
                    j++;
                }
                else if(n<= total/2 && j== 0){
                    i--;
                    dir = 1;
                }
                else{
                    i--;
                    j--;
                }
            }
            n++;
        }
    }
}
