/**
 * LeetCode #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-09T04:41:07.350Z
 */

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestBefore = prices[0];
        for(int i = 1; i < prices.length; i++){
            lowestBefore = Math.min(lowestBefore, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - lowestBefore);
        }
        return maxProfit;
    }
}