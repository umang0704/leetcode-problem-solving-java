package medium;

import utilities.GetValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.IntStream;

public class LongestSubstringWithoutRepeatingCharacters {
    private static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int length = 0 , i = 0;
            HashSet<Character> appeared  = new HashSet<>();
            for(int j = 0;i<s.length() ; i++){
                char c= s.charAt(j);
                while(appeared.contains(c)){
                    appeared.remove(s.charAt(i++));
                }
                appeared.add(c);
                length = Math.max(length,j-i+1);
            }
            return length;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring(GetValue.scanString("Enter String:")));
    }
}
/*

Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0

"abcabcbb"
au
Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

 */