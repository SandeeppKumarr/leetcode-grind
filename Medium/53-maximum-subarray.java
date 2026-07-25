/**
 * LeetCode #53: Maximum Subarray
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T14:03:48.932Z
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}

