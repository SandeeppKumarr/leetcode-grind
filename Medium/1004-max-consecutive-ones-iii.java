/**
 * LeetCode #1004: Max Consecutive Ones III
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-22T06:47:55.697Z
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        int count = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0) count++;
            if(count > k){
                if(nums[left] == 0) count--;
                left++;
            }
            else maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}