/**
 * LeetCode #169: Majority Element
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-09T04:47:42.152Z
 */

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;

            if (num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
}