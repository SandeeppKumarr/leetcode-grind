/**
 * LeetCode #287: Find the Duplicate Number
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T12:55:12.716Z
 */

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
