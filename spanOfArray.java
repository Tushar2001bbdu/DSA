package pepCoding;

import java.util.Scanner;

public class spanOfArray {

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

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
//reading array elements from the user

            if(max < a[i]){
                max = a[i];
            }
            if(min> a[i]){
                min =  a[i];
            }
        }
        System.out.println(max -min);

    }
}
