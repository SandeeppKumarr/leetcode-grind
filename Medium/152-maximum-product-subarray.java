/**
 * LeetCode #152: Maximum Product Subarray
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T15:20:47.910Z
 */

class Solution {
    public int maxProduct(int[] nums) {
        int currProduct = nums[0];
        int maxProduct = nums[0];
        for(int i = 1; i < nums.length; i++){
            currProduct = Math.max(currProduct * nums[i], nums[i]);
            maxProduct = Math.max(maxProduct, currProduct);
        }
        return maxProduct;
    }
}