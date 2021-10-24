package pepCoding;

import java.util.Scanner;

public class longestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int minLength = 0;
        int ansi=0;
        int ansj=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
//                System.out.println(sub);
                if(isPalindrome(sub) == true){
//                     System.out.println("*" + sub);
                    if(j-i > minLength){
                        ansi = i;
                        ansj=j;
                        minLength = j-i;
                    }
                }

            }
        }
        System.out.println(s.substring(ansi, ansj));
    }

    public static boolean isPalindrome(String sub){
        boolean flag = true;
        int l =0;
        int r = sub.length()-1;
//        System.out.println(sub + " " + l + " " + r);
        while(l<r){
            if(sub.charAt(l) != sub.charAt(r)){
                flag = false;
                break;
            }
            l++;
            r--;
        }
        return flag;
    }
}
