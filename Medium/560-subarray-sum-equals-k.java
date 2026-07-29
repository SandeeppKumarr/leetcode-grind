/**
 * LeetCode #560: Subarray Sum Equals K
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T13:20:50.820Z
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sums = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        sums.put(0, 1);
        for(int num : nums){
            prefixSum += num;
            count += sums.getOrDefault(prefixSum - k, 0);
            sums.put(prefixSum, sums.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}