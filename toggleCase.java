package pepCoding;

import java.util.Scanner;

public class toggleCase {
    public static String toggleCase(String str) {
        //write your code here
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char curr = sb.charAt(i);
            char uch;
            if (curr >= 'a' && curr <= 'z') {
                uch = (char) (curr - 'a' + 'A');

            } else {
                uch = (char) (curr + 'a' - 'A');

            }
            sb.setCharAt(i, uch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(toggleCase(str));
    }
}
