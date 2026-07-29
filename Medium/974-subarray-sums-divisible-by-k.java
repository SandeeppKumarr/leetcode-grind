/**
 * LeetCode #974: Subarray Sums Divisible by K
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T14:45:36.829Z
 */

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        freq.put(0, 1);
        for(int num : nums){
            prefixSum += num;
            int mod = prefixSum % k;
            if(mod < 0) mod += k;
            if(freq.containsKey(mod)){
                count += freq.get(mod);
                freq.put(mod, freq.get(mod) + 1);
            }
            else freq.put(mod, 1);
        }
        return count;
    }
}