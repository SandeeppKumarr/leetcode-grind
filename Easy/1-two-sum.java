/**
 * LeetCode #1: Two Sum
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-09T04:48:36.962Z
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) return new int[]{numMap.get(complement), i};
            numMap.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}