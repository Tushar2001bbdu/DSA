package pepCoding;

import java.util.Scanner;

public class subsetsOfArray {
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

        int limit = (int) Math.pow(2, a.length);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;

            for (int j = a.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    set = "-\t" + set;
                } else {
                    set = a[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}
