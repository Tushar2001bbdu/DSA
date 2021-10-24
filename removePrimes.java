package pepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimes {

    public static void solution(ArrayList<Integer> al) {
        // write your code here


        for (int i=al.size() -1; i>=0;i --){
            boolean flag = true;
            System.out.println("#" + i);
            for (int j = 2; j*j <= al.get(i); j++) {
                System.out.println("*" + al.get(i) + " "+ j );
                if (al.get(i) % j == 0) {
                    // numbe is not prime
                    flag = false;
                }
            }
            if(flag){
               al.remove(i);

            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
}
