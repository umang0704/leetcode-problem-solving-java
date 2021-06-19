package easy;

public class ReverseInteger_april_25_2021 {

    class Solution {

        public int reverse(int x) {
            int max = (int) Math.pow(2, 31);
            if (x == 0 || x > max - 1 || x < -1 * max) {
                return 0;
            } else {
                long ret = 0;
                int q = x;
                int r = 0;
                while (q != 0) {
                    r = q % 10;
                    q = q / 10;
                    ret = ret * 10 + r;
                    if (ret > max - 1 || ret < max * -1) {
                        return 0;
                    }
                }

                return (int) ret;
            }
        }
    }

    public static void main(String[] args) {
        int a = new ReverseInteger_april_25_2021().new Solution().
                reverse(1534236469);
    }
}
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 

Constraints:

-231 <= x <= 231 - 1
 */
