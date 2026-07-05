/**
 * LeetCode #645: Set Mismatch
 * Difficulty: Easy
 * Language: C++
 * Runtime: N/A
 * Memory: N/A
 * Date: 2026-07-05T12:34:45.759Z
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR all array elements and numbers from 1 to n
        for (int num : nums) {
            xor ^= num;
        }
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // Rightmost set bit