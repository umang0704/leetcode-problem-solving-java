package easy;

public class CanPlaceFlower {

    static class Solution {

        public static boolean canPlaceFlowers(int[] a, int n) {
            int i = 0, count = 0;
            while (i < a.length) {
                if (a[i] == 0 && (i == 0 || a[i - 1] == 0) && (i == a.length - 1 || a[i + 1] == 0)) {
                    a[i++] = 1;
                    count++;
                }
                i++;
            }
            if (count == n) {
                return true;
            } else {
                return false;
            }
        }

//        public static boolean canPlaceFlowers2(int[] a, int n) {
//            int count = 0;
//            for (int i = 0; i < a.length - 1; i++) {
//                //System.out.println(" i="+i);
//                if (a[i] == 0) {
//                    int temp = i;
//                    int c0 = 1;
//                    i++;
//                    //System.out.println(" \ti="+i);
//                    while (a[i] == 0) {
//                        c0++;
//                        if (c0 == 3) {
//                            a[temp + 1] = 1;
//                            count++;
//                            i = temp + 1;  //System.out.println(" i="+i);
//                            //System.out.println("count="+count + " c0=" + c0+" i="+i);
//                            break;
//                        }
//                        i++;  //System.out.println(" \ti="+i);
//                    }
//                }
//            }
//            if (count == n) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public static boolean canPlaceFlowers1(int[] a, int n) {
//            int count = 0;
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] == 0) {
//                    int count0 = 1;
//                    while (i < a.length && a[++i] == 0) {
//                        count0++;
//                        if (count0 == 3) {
//                            count++;
//                            break;
//                        }
//                    }
//                }
//            }
//            if (count == n) {
//                return true;
//            } else {
//                return false;
//            }
//        }
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 0, 0, 0, 1};
        System.out.println(Solution.canPlaceFlowers(a, 2));
    }

}
/*

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 
{1, 0, 0, 0,0,0, 1} ,2

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length

 */
