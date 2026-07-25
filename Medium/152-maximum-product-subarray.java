/**
 * LeetCode #152: Maximum Product Subarray
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T17:28:04.821Z
 */

class Solution {
    public int maxProduct(int[] nums) {
        int maxCurrProduct = nums[0];
        int minCurrProduct = nums[0];
        int maxProduct = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = maxCurrProduct;
            maxCurrProduct = Math.max(nums[i], Math.max(maxCurrProduct * nums[i], minCurrProduct * nums[i]));
            minCurrProduct = Math.min(nums[i], Math.min(temp * nums[i], minCurrProduct * nums[i]));
            maxProduct = Math.max(maxProduct, maxCurrProduct);
        }
        return maxProduct;
    }
}