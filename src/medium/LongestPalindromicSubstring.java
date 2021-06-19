package medium;

import utilities.GetValue;
import utilities.Operations;

public class LongestPalindromicSubstring {
    public static class Solution {
        static public String longestPalindrome1(String s) {
            if (s == null || s.length() < 1) return "";
            int start = 0,end = 0;
            for (int i = 0; i < s.length(); i++) {
                int evenPalindromeLength = expandAt(s, i, i + 1);
                int oddPalindromeLength = expandAt(s, i, i);
                int length = Math.max(evenPalindromeLength,oddPalindromeLength);
                if(length > end - start){
                    start = i - (length - 1)/2;
                    end = i -length/2;
                }
            }
            return s.substring(start,end + 1);
        }

        private static int expandAt(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left + 1;
        }

        //--------------------------------------------------------------------------------------------------------------
        static boolean isPalindrome(String str) {
            for (int i = 0; i < str.length() / 2; i++)
                if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                    return false;
            return true;
        }

        public static String longestPalindrome(String s) {
            if (s.length() <= 1) return s;
            if (s.length() == 2) if (s.charAt(0) == s.charAt(1)) return s;
            else return s.substring(1);
            int[][] arr = new int[s.length()][s.length()];

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (i == j)
                        arr[i][j] = 1;
                    if (j > i && isPalindrome(s.substring(i, j + 1)))
                        arr[i][j] = j - i + 1;
                }
            }
            Operations.print2DArray(arr);
            int low = -1, high = -1;
            int length = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (j >= i && arr[i][j] > length) {
                        length = arr[i][j];
                        low = i;
                        high = j;
                    }
                }
            }
            System.out.println(low + " " + high);
            return s.substring(low, high + 1);
        }

        public static void main(String[] args) {
            System.out.println(longestPalindrome(GetValue.scanString("Longest Palindromic Substring")));
        }
    }
}

/*

ALgo- Checking for all odd and even substrings

 */