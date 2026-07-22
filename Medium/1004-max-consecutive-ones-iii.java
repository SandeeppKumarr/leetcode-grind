/**
 * LeetCode #1004: Max Consecutive Ones III
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-22T06:45:02.766Z
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        int[] frequency = new int[2];
        int min = 0;
        for(int right = 0; right < nums.length; right++){
            frequency[nums[right]]++;
            min = Math.min(frequency[0], frequency[1]);
            if(min > k){
                frequency[nums[left]]--;
                left++;
            }
            else maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}