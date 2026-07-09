/**
 * LeetCode #287: Find the Duplicate Number
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:46:13.422Z
 */

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);
        slow = 0;
        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}