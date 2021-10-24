package pepCoding;

import java.util.Scanner;

public class peakElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0;
        int max = a[0];
        for (int i = 0; i < n ; i++) {

            if(max < a[i]){
                pos = i;
                max = a[i];
            }

//            if(0<i && i<n-1) {
//
//
//                if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
//                    pos = i;
//                }
//            }
//            else if(i==1){
//                pos = a[i] > a[i-1] ? i : i-1;
//            }

        }
        System.out.println(pos);

    }
}
