package pepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class intersectionOfArrays {

    public static void printIntersection(int a[] ,int b[],int m ,int n){

        if (m > n) {
            int[] temp = a;
            a = b;
            b = temp;

            int temp2 = m;
            m = n;
            n=temp2;
        }
        Arrays.sort(a);

        // Search every element of bigger array in smaller
        // array and print the element if found
        for (int i = 0; i < n; i++) {
            if (binarySearch(a, 0, m - 1, b[i]) != -1)
                System.out.print(b[i] + " ");
        }

    }
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//reading the number of elements from the that we want to enter
        int n = sc.nextInt();
//creates an array in the memory of length 10
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
//reading array elements from the user
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
//creates an array in the memory of length 10
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
//reading array elements from the user
            b[i] = sc.nextInt();
        }
        printIntersection(a, b, n, m);

    }
}
