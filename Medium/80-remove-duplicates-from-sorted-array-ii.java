/**
 * LeetCode #80: Remove Duplicates from Sorted Array II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-14T15:46:03.352Z
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int k = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) <= 2) {
                nums[k] = num;
                k++;
            }
        }

        return k;      
    }
}