/**
 * LeetCode #18: 4Sum
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:48:50.058Z
 */

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while(k < l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add(nums[l]);
                        result.add(quad);
                        while (quad.get(2) == nums[k] && k < l) k++;
                        while (quad.get(3) == nums[l] && k < l) l--;
                    }
                    else if(sum > target) l--;
                    else k++;
                }
            }
        }
        return result;
    }
}