package pepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class firstUniqueCharacterInAString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        System.out.println(s + s.length());
        int[] a = new int[26];

        for (int i = 0; i < s.length(); i++) {
            System.out.println("#");
            int num = s.charAt(i) - 'a';
            System.out.println('*' + s.charAt(i) +  num);
//            if (a[num] == null) {
//                al.set(num, 0);
//            } else {
//                al.set('a' - s.charAt(i), al.get(s.charAt(i) - 'a') + 1);
//            }
        }
        int min = 10000;
        for (int i : a) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

}
