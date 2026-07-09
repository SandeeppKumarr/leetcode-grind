/**
 * LeetCode #229: Majority Element II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:47:55.487Z
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if(n == 0) return ans;
        if(n == 1){
            ans.add(nums[0]);
            return ans;
        }
        int candidate1 = 0; int candidate2 = 0;
        int count1 = 0; int count2 = 0;

        for(int num : nums){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
            else if(count1 == 0){
                candidate1 = num;
                count1++;
            }
            else if(count2 == 0){
                candidate2 = num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int num : nums){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }
        if(count1 > (n/3)) ans.add(candidate1);
        if(count2 > (n/3)) ans.add(candidate2);
        return ans;
    }
}