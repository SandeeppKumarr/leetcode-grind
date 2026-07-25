/**
 * LeetCode #202: Happy Number
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-25T13:34:28.521Z
 */

class Solution {
    int calc(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while(fast != 1 && calc(fast) != 1){
            slow = calc(slow);
            fast = calc(calc(fast));
            //System.out.println(fast);
            if(slow == fast) return false;
        }
        return true;
    }
}