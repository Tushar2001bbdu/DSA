package pepCoding;

import java.util.Scanner;

public class RandomPatternInTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int initial = 1;
int k,j;
        for (int i = 0; i < n; i++) {
            for (j = 0,k = initial; j<n ;j++, k++){
                System.out.print(k + " ");
            }
            if (i < (n-1)/ 2) {
                initial = k + n;
            } else if (n%2 ==0 && i == ((n-1) / 2) ) {
                initial = k;
            }else if (n%2 !=0 && i == ((n) / 2) ) {
                initial -= n;
            } else {
                initial = initial - (n*2);
            }
            System.out.println();
        }

    }
}
