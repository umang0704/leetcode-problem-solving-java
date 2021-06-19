package easy;

public class ValidMountainArray {

    static class Solution {

        public static boolean validMountainArray(int[] a) {
            if (a.length < 3) {
                return false;
            }
            int flag = 0;//increasing
           for (int i = 0; i < a.length; i++) {
               if( flag == 0){
                   if(i == 0 && a[i]>a[i+1])
                       return false;
                   else if(i!=0 && a[i]>a[i+1])
                       flag = 1;   
                   continue ;
               }
               
               if (flag == 1){
                   if(i==a.length - 1 && a[i]>a[i-1])
                       return false;
                   else if(i!=a.length - 1 && a[i]>a[i-1])
                       return false; 
               }

            }
            return flag==1;
        }
        
    }

    public static void main(String[] args) {
         //int a[] = {0, 3, 2, 1};
        //int a[] = {3, 5, 5};
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
         //int a[] = {0,1,2,1,2};
        System.out.println(Solution.validMountainArray(a));
    }
}
/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 

Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
 */
