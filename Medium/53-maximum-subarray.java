/**
 * LeetCode #53: Maximum Subarray
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-08T17:34:35.664Z
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum); 
        }
        return maxSum;
    }
}