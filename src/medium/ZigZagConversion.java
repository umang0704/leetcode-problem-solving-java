package medium;

import utilities.GetValue;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        int sbsRow = 0, directionDown = 0;

        for (int i = 0; i < sbs.length; i++)
            sbs[i] = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sbsRow += directionDown;
            sbs[sbsRow].append(s.charAt(i));
            if (sbsRow == 0 || sbsRow == numRows - 1)
                directionDown = directionDown == 0 ? 1 : -directionDown;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder s1 : sbs)
            result.append(s1.toString());
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert(GetValue.scanString("Enter string"), GetValue.scanInt("Enter rows")));
    }
}
