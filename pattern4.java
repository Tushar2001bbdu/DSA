package pepCoding;

import java.util.Scanner;

public class pattern4 {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                if(i>j){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }

            } System.out.println();
        }
    }
}
