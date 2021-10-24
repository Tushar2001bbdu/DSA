package pepCoding;

import java.util.Scanner;

public class stringCompression {

    public static String compression1(String str){
        // write your code here
        String s = str.charAt(0) + "";
        int count = 1;

        for(int i =1; i< str.length();i++){

            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr != prev){
                s += curr;
            }

        }


        System.out.println(s);
        return s;
    }

    public static String compression2(String str){
        // write your code here
        String s = str.charAt(0) + "";
        int count = 1;

        for(int i =1; i< str.length();i++){

            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count ++;
            }
            else {
                if(count > 1) {
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }
        if(count > 1){
            s +=count;
            count =1;
        }

        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        String str= sc.nextLine();              //reads string

        compression1(str);
        compression2(str);
    }
    
}
