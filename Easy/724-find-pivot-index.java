/**
 * LeetCode #724: Find Pivot Index
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-29T12:12:26.754Z
 */

class Solution {
    public int pivotIndex(int[] nums) {
        // int[] prefixSum = new int[nums.length];
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int prefixSum = 0;
        for(int i = 0; i < nums.length; i++){
            int suffixSum = sum - nums[i] - prefixSum;
            if(prefixSum == suffixSum) return i;
            prefixSum += nums[i];
        }
        return -1;
    }
}