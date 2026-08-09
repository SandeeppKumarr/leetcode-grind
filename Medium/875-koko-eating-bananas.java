/**
 * LeetCode #875: Koko Eating Bananas
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-09T09:04:15.528Z
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int result = high;
        for(int pile : piles){
            high = Math.max(high, pile);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            long hours = 0;
            for(int pile : piles){
                hours += pile / mid;
                if(pile % mid != 0) hours++;
            }
            if(hours <= h){
                result = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return result;
    }
}