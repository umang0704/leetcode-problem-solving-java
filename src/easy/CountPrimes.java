package easy;

import java.util.Arrays;

public class CountPrimes {

    static class Solution {

        public static int countPrimes(int n) {
            int count = 0;
            boolean c[] = new boolean[n + 1];
            Arrays.fill(c, true);
            for (int i = 2; (i*i)<= n; i++) {
                if (c[i] == true) {
                    for (int j = i * i; j < n; j = j + i) {
                        c[j] = false;
                    }
                }
            }
            for (int i = 2; i < n; i++) {
                if (c[i] == true) {
                    count++;
                }
            }

            return count;
        }
//        public static int countPrimes1(int n) {
//            int count = 0;
//            xx: for (int i = 1; i < n; i++) {
//                switch (i) {
//                    case 1:
//                        continue xx;
//                    case 2:
//                        count++;
//                        break;
//                    default:
//                        if(i%2==0)
//                            continue xx;
//                        for(int j =2;j<i;j++)
//                            if(i%j==0)
//                                continue xx; 
//                        count++; 
//                        break;
//                }
//                        //System.out.println("Prime: "+i);
//            }
//            return count;
//        }
    }

    public static void main(String[] args) {
////        System.out.println(Solution.countPrimes(1));
    System.out.println(Solution.countPrimes(499979));
//        System.out.println(Solution.countPrimes(10));
//        System.out.println(Solution.countPrimes(3));
//        System.out.println(Solution.countPrimes(10));
    }
}
/*

Count the number of prime numbers less than a non-negative number, n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0

 */
