/**
 * LeetCode #974: Subarray Sums Divisible by K
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T14:51:45.455Z
 */

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        freq.put(0, 1);
        for(int num : nums){
            prefixSum += num;
            //int mod = prefixSum % k;
            int mod = (prefixSum % k + k) % k;
            //if(mod < 0) mod += k;
            count += freq.getOrDefault(mod, 0);
            freq.put(mod, freq.getOrDefault(mod, 0) + 1);
        }
        return count;
    }
}