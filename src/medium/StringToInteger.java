package medium;

import utilities.GetValue;

public class StringToInteger {
    class Solution {
        public int myAtoi(String s) {
            if (s.length() > 200)
                return 0;
            s = s.trim();
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                    sb.append(s.charAt(i));
                } else if (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                } else {
                    break;
                }
            }
            if (sb.toString().length() == 0 || (sb.toString().length() == 1 && (sb.toString().equals("-") || sb.toString().equals("+")))) {
                return 0;
            } else {
                double d = Double.parseDouble(sb.toString());
                return (int) (d>Integer.MAX_VALUE?Integer.MAX_VALUE:d<Integer.MIN_VALUE ? Integer.MIN_VALUE : d);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger().new Solution().myAtoi(GetValue.scanString("Enter String:")));
    }
}

