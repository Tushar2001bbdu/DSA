package pepCoding;

import java.util.Scanner;

public class inverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = 0;
        int i = 1;
        while (n > 0) {
            ans = ans + (i * (int) Math.pow(10, n % 10 - 1));
//            System.out.println("******" + ans);
            n = n / 10;
            i++;
        }
        System.out.println(ans);

    }
}
