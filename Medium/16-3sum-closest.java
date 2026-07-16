/**
 * LeetCode #16: 3Sum Closest
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-16T06:24:47.943Z
 */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i];
                sum += nums[j];
                sum += nums[k];
                if(sum == target) return sum;
                else if(sum < target){
                    int diff = target - sum;
                    if(diff < minDiff){
                        minDiff = diff;
                        result = sum;
                    }
                    j++;
                }
                else if(sum > target){
                    int diff = sum - target;
                    if(diff < minDiff){
                        minDiff = diff;
                        result = sum;
                    }
                    k--;
                }
            }
        }
        return result;
    }
}