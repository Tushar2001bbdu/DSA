package pepCoding;

import java.util.Scanner;

public class containerWithMostWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans=0;


        for (int i = 0; i < n-1; i++) {
            for(int j = i+1;j < n; j++){

                int min = Math.min(a[i], a[j]);
                int length = j-i;

                int vol = min * length;
//                System.out.println(i + " " + j + " " + vol + " " + ans);
                if(ans < vol){
                    ans = vol;
                }
            }
        }

        System.out.println(ans);
    }
}
