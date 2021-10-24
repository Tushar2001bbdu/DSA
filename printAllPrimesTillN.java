package pepCoding;

import java.util.Scanner;

public class printAllPrimesTillN {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        for(int a=x;a<y;a++){


            boolean flag = true;
            for(int div =2;div* div <=a;div++){
                if (a % div == 0) {
                    flag = false;
                    break;
                }

            }
            if(flag){
                System.out.println(a);
            }
        }
    }
}
