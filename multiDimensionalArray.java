package pepCoding;

import java.util.Scanner;

public class multiDimensionalArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int a[][]=new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int temp = columns -1;

        int out[][] = new int[columns][rows];
        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                out[j][temp]=a[i][j];
            }
            temp--;
        }



        for(int []x:out){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
