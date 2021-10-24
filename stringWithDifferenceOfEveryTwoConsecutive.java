package pepCoding;

import java.util.Scanner;

public class stringWithDifferenceOfEveryTwoConsecutive {
    public static String custFunction(String str) {
        // write your code here
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));


        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            int temp = curr - prev;
            sb.append(temp);
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        String str = sc.nextLine();              //reads string

        System.out.println((custFunction(str)));
    }
}
