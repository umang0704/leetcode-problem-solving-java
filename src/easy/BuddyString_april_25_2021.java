package easy;

public class BuddyString_april_25_2021 {

    class Solution {

        public boolean buddyStrings(String a, String b) {
            if (a.length() != b.length()) {
                return false;
            }
            if (a.equals(b)) {
                int[] comp = new int[26];
                for (int i = 0; i < a.length(); i++) {
                    comp[a.charAt(i) - 'a']++;
                }
                for (int t : comp) {
                    if (t > 1) {
                        return true;
                    }
                }
                return false;
            } else {
                int x = -1, y = -1;
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) != b.charAt(i)) {
                        if (x == -1) {
                            x = i;
                        } else if (y == -1) {
                            y = i;
                        } else {
                            return false;
                        }
                    }
                }

                return (y != -1 && a.charAt(x) == b.charAt(y) && a.charAt(y) == b.charAt(x));
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(new BuddyString_april_25_2021().new Solution().buddyStrings("aaaaabc", "aaaaacb"));
//       System.out.println(new BuddyString_april_25_2021().new Solution().buddyStrings("av", "ba"));
        System.out.println(new BuddyString_april_25_2021().new Solution().buddyStrings("acb", "acb"));
//        System.out.println(new BuddyString_april_25_2021().new Solution().buddyStrings("abcd", "cbad"));
    }
}

/*
Given two strings a and b, return true if you can swap two letters in a so the result is equal to b, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at a[i] and a[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:

Input: a = "ab", b = "ba"
Output: true
Explanation: You can swap a[0] = 'a' and a[1] = 'b' to get "ba", which is equal to b.
Example 2:

Input: a = "ab", b = "ab"
Output: false
Explanation: The only letters you can swap are a[0] = 'a' and a[1] = 'b', which results in "ba" != b.
Example 3:

Input: a = "aa", b = "aa"
Output: true
Explanation: You can swap a[0] = 'a' and a[1] = 'a' to get "aa", which is equal to b.
Example 4:

Input: a = "aaaaaaabc", b = "aaaaaaacb"
Output: true
 

Constraints:

1 <= a.length, b.length <= 2 * 10^4
a and b consist of lowercase letters.
 */
