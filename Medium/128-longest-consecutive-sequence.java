/**
 * LeetCode #128: Longest Consecutive Sequence
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:49:05.186Z
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int max_result = 1;
        for(int ele : set){
            if(set.contains(ele - 1) == false){
                int count = 1;
                int curr = ele;
                while(set.contains(curr + 1)){
                    count++;
                    curr++;
                }
                max_result = Math.max(max_result, count);
            }
        }
        return max_result;      
    }
}