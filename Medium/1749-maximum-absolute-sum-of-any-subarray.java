/**
 * LeetCode #1749: Maximum Absolute Sum of Any Subarray
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T20:51:58.806Z
 */

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minCurrSum = nums[0], maxCurrSum = nums[0], maxSum = nums[0], minSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxCurrSum = Math.max(maxCurrSum + nums[i], nums[i]);
            minCurrSum = Math.min(minCurrSum + nums[i], nums[i]);
            maxSum = Math.max(maxCurrSum, maxSum);
            minSum = Math.min(minCurrSum, minSum);
        }
        return Math.max(maxSum, (minSum * (-1)));
    }
}