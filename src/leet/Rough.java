/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leet;

/**
 *
 * @author Umang
 */
public class Rough {

    public static int reverse(int x) {
        if (x == 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        } else {
            int ret = 0;
            int q = x;
            int r = 0;
            while (q != 0) {
                r = q % 10;
                q = q / 10;
                ret = ret * 10 + r; 
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(reverse(1534236469)); 
    }
}
