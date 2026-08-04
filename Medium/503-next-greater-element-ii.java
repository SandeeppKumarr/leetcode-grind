/**
 * LeetCode #503: Next Greater Element II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-04T10:16:34.698Z
 */

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        for(int i = n - 1; i >= 0; i--){
            if(!stack.isEmpty() && nums[i] >= stack.peek()) stack.pop();
            stack.push(nums[i]);
        }
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                    stack.pop();
                }
            if(!stack.isEmpty()){
                result[i] = stack.peek();
            }
            else result[i] = -1;
            stack.push(nums[i]);
        }
        return result;
    }
}