package pepCoding;

import java.util.Scanner;

public class multiDimentionalArrayRotateBy90 {
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

//transpose

        for(int i=0; i<rows;i++)
        {
            for(int j=i; j<columns;j++)
            {
                int temp = a[i][j];
                System.out.println("t" + temp);
                a[i][j]=a[j][i];
                a[j][i] = temp;
            }
        }

        //reverse an array
        for(int i=0; i<rows;i++)
        {
            int l = 0;
            int r = a[i].length-1;
            System.out.println("r" + r);
            while(l<r){
                int temp2 = a[i][l];
                a[i][l]=a[i][r];
                a[i][r]= temp2;
                l++;
                r--;
            }
        }


        System.out.print("\nData you entered : \n");
        for(int []x:a){
            for(int y:x){
                System.out.print(y+"        ");
            }
            System.out.println();
        }

    }
}
