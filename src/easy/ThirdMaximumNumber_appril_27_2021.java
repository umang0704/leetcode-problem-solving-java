package easy;

import java.util.*;

public class ThirdMaximumNumber_appril_27_2021 {

    static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println("");
    }

    static class Solution {

        public static int thirdMax(int[] nums) {
            Arrays.sort(nums);
            printArray(nums);
            if (nums.length < 3) {
                return nums[nums.length - 1];
            }
            int i = nums.length - 1;
            int val = nums[i];
            int j = 2;
            i--;
            while (j > 0 && i >= 0) {
                if (val != nums[i]) {
                    val = nums[i];
                    j--;
                }
                System.out.println("i:" + i + " j=" + j + " val=" + val);
                i--;
            }
            if (j > 1) {
                return nums[nums.length - 1];
            }
            return val;
        }

        static int thirdMax1(int a[]) { 
            ArrayList<Integer> b = new ArrayList<>();
            Arrays.sort(a);
            int i = a.length - 1; 
            b.add(a[i]);
            for (; i > 0; i--) {
                 if (a[i] != a[i-1]) { 
                     b.add(a[i-1]);
                 }
            }
            System.out.println(b);
            if(b.size()>2){
                return b.get(2);
            }else{
                return b.get(0);
            } 
        }
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 2, 5, 3, 5};
       // int[] nums = {1, 1, 2};
       //int[] nums = {3,2,1};
       int[] nums = {2,1};
        System.out.println(Solution.thirdMax(nums));
        System.out.println(Solution.thirdMax1(nums));

    }
}

/*
 Third Maximum Number
Easy

985

1705

Add to List

Share
Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */
