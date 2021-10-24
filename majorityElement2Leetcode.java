package pepCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class majorityElement2Leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> res = new ArrayList<>();
        if (n == 0) {

            for(int i: res){
                System.out.println(i);
            }
        }
        if (n == 1)
        {
            res.add(nums[0]);
            for(int i: res){
                System.out.println(i);
            }
        }

        Arrays.sort(nums);
        int third = n / 3;
        int count = 1;
        for (int i = 1; i < n; i ++)
        {
            if (nums[i] == nums[i-1])
            {
                count ++; // for nums[i]
            }
            else
            {
                if (count > third) res.add(nums[i-1]);

                count = 1; // for nums[i]
            }
        }

        if (count > third) res.add(nums[n-1]);

        for(int i: res){
            System.out.println(i);
        }

    }
}
