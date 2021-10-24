package pepCoding;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        for(int i=a;i>0;i--){

            for(int j=i;j>0;j--){
                System.out.print("*\t");
            } System.out.println();
        }
    }
}
