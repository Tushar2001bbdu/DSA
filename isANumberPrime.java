package pepCoding;

import java.util.Scanner;

public class isANumberPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int a=0;a<t;a++){
int n = scn.nextInt();

           boolean flag = true;
for(int div =2;div* div <=n;div++){
    if (n % div == 0) {
        flag = false;
        break;
    }

}
if(flag){
    System.out.println("prime");
}else{
    System.out.println("not prime");
}
        }
    }
}
