/**
 * LeetCode #15: 3Sum
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-14T20:30:27.499Z
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                long sum = nums[i];
                sum += nums[j];
                sum += nums[k];
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    result.add(triplet);
                    while(triplet.get(1) == nums[j] && j < k) j++;
                    while(triplet.get(2) == nums[k] && j < k) k--;
                }
                else if(sum < 0) j++;
                else k--;
            }
        }
        return result;
    }
}