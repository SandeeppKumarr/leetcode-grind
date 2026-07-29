/**
 * LeetCode #525: Contiguous Array
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T18:03:42.757Z
 */

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> diffs = new HashMap<>();
        int zeros = 0, ones = 0, maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeros++;
            else ones++;
            int diff = zeros - ones;
            if(diff == 0) maxLen = Math.max(maxLen, i + 1);
            else{
                if(diffs.containsKey(diff)) maxLen = Math.max(maxLen, i - diffs.get(diff));
                else diffs.put(diff, i);
            }
        }
        return maxLen;
    }
}