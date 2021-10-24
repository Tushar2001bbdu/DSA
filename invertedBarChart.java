package pepCoding;

import java.util.Scanner;

public class invertedBarChart {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//reading the number of elements from the that we want to enter
        int n=sc.nextInt();
//creates an array in the memory of length 10
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            a[i]=sc.nextInt();
        }


//find max
        int max = 0;
        for(int i=0; i<n; i++) {
            if(a[i]> max){
                max =a[i];
            }
        }

        for(int i=1;i<=max;i++){
            for(int j=0;j<a.length;j++){
                if(i<=a[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }


    }
}
