package easy;

public class ExcelSheetColumnTitleEasy {

    static class Solution {

        public static String convertToTitle(int a) {
            StringBuilder val = new StringBuilder();
            while (a > 0) {

                int r = a % 26;
                if (r == 0) {
                    val.append('Z');
                    a = (a / 26) - 1;
                } else {
                    val.append((char) ('A' + r - 1));
                    a = a / 26;

                }
            }

            return val.reverse().toString();
        }
    }

    public static void main(String[] args) {

    }
}

/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
Example 4:

Input: columnNumber = 2147483647
Output: "FXSHRXW"
 

Constraints:

1 <= columnNumber <= 231 - 1

 */
