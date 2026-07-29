/**
 * LeetCode #724: Find Pivot Index
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-29T12:10:52.561Z
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        for(int i = 0; i < nums.length; i++){
            int suffixSum = sum - nums[i] - prefixSum[i];
            if(prefixSum[i] == suffixSum) return i;
        }
        return -1;
    }
}