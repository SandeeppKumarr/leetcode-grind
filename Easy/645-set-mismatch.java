/**
 * LeetCode #645: Set Mismatch
 * Difficulty: Easy
 * Language: java
 * Runtime: 0 ms
 * Memory: 47.5 MB
 * Date: 2026-07-05T12:59:48.655Z
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR all array elements and numbers from 1 to n
        for (int num : nums) {
            xor ^= num;
        }
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // Rightmost set bit
        int mask = xor & -xor;

        int x = 0, y = 0;

        // Partition array elements
        for (int num : nums) {
            if ((num & mask) != 0)
                x ^= num;
            else
                y ^= num;
        }

        // Partition numbers 1...n
        for (int i = 1; i <= n; i++) {
            if ((i & mask) != 0)
                x ^= i;
            else
                y ^= i;
        }

        // Determine which is duplicate
        for (int num : nums) {
            if (num == x)
                return new int[]{x, y};
        }

        return new int[]{y, x};
    }
}