/**
 * LeetCode #724: Find Pivot Index
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-29T12:18:10.356Z
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int prefixSum = 0;
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
            if(prefixSum == sum) return i;
            prefixSum += nums[i];
        }
        return -1;
    }
}