/**
 * LeetCode #739: Daily Temperatures
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-04T10:29:45.027Z
 */

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>(); //stores index
        int[] result = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }
            else result[i] = 0;
            stack.push(i);
        }
        return result;
    }
}