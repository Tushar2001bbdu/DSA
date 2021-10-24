package pepCoding;

import java.util.Scanner;

public class brokenEconomy {
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
        int x = sc.nextInt();

        int ceil = 0;
        int floor = 0;
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (x > a[mid]) {
                l = mid + 1;
                floor = a[mid];
            } else if (x < a[mid]) {
                r = mid - 1;
                ceil = a[mid];
            } else {
//                System.out.println("Element is found at index: " + mid);
                ceil = a[mid];
                floor = a[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
//        if (r < l) {
//            System.out.println("Element is not found!");
//        }
    }
}
