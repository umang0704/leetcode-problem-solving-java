package easy;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class LengthOfLastWord {

    static class Solution {

        public static int lengthOfLastWord2(String s) {
            if (s.trim().length() == 0) {
                return 0;
            }

            String[] st1 = s.split(" ");
            int size = st1.length - 1;

            return st1[size].length();
        }

        public static int lengthOfLastWord(String s) {
            s = s.trim();
            if (s.length() == 0) {
                return 0;
            }
            if (s.length() == 1) {

                if (Character.isAlphabetic(s.charAt(0))) {
                    return 1;
                } else {
                    return 0;
                }
            }

            StringTokenizer st = new StringTokenizer(s, " ");
            ArrayList<String> sf = new ArrayList<>();
            while (st.hasMoreTokens()) {
                sf.add(st.nextToken());
            }

            for (int i = sf.size() - 1; i >= 0; i--) {
                try {
                    Double d = Double.parseDouble(sf.get(i));
                    System.out.println(d);
                } catch (NumberFormatException ex) {
                    return sf.get(i).length();
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLastWord(" a aa"));
    }
}
/*

Length of Last Word
Easy

1104

3179

Add to List

Share
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.

*/