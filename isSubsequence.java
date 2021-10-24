package pepCoding;

import java.util.Scanner;

public class isSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String b = scn.nextLine();
        String s = scn.nextLine();
        System.out.println(isSubsequence2(b,s));
    }

    public static boolean isSubsequence2(String b, String s) {
        if(b.length() == 0) return true;
        int i = 0, j = 0;
        while (j < s.length() && i < b.length()) {

            if (s.charAt(j) == b.charAt(i)) {
                i++;

            }
            j++;

        }
        if (i < b.length()) {
            return false;
        } else {
            return true;
        }


    }
}
