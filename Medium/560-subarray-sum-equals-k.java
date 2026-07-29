/**
 * LeetCode #560: Subarray Sum Equals K
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T13:18:10.394Z
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sums = new HashMap<>();
        int count = 0;
        int currSum = 0;
        sums.put(0, 1);
        for(int num : nums){
            currSum += num;
            if(sums.containsKey(currSum - k)){
                count += sums.get(currSum - k);
            }
            sums.put(currSum, sums.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}