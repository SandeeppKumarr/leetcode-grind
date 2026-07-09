/**
 * LeetCode #50: Pow(x, n)
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:47:27.149Z
 */

class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        double power = 1;

        while(n != 0){
            if((n & 1) != 0){
                power *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return power;
    }
}