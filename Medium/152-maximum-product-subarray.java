/**
 * LeetCode #152: Maximum Product Subarray
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T17:20:43.708Z
 */

class Solution {
    public int maxProduct(int[] nums) {
        int currProduct = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = currProduct;
            currProduct = Math.max(nums[i], Math.max(currProduct * nums[i], minProduct * nums[i]));
            minProduct = Math.min(nums[i], Math.min(temp * nums[i], minProduct * nums[i]));
            maxProduct = Math.max(maxProduct, currProduct);
        }
        return maxProduct;
    }
}