package pepCoding;

import java.util.Scanner;

public class containerWithMostWaterOptimized {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int len = A.length;
        int l = 0;
        int r = len -1;
        int area = 0;

        while (l < r)
        {
            int minValue = Math.min(A[l], A[r]);
            // Calculating the max area
            area = Math.max(area,minValue * (r - l));

            if (A[l] < A[r])
                l += 1;

            else
                r -= 1;
        }
        System.out.println(area);


    }
}