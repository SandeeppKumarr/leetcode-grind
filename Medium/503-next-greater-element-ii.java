/**
 * LeetCode #503: Next Greater Element II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-03T18:04:47.015Z
 */


            // Pop all elements that are <= current, because they can't be next greater
            while (!st.isEmpty() && st.peek() <= current) {
                st.pop();
            }

            // Only fill results when i < n (first pass for original positions)
            if (i < n) {
                nge[i] = st.isEmpty() ? -1 : st.peek();
            }

            // Push current as a candidate for earlier elements
            int current = nums[i % n];
        // Iterate from right to left across a logical array of length 2*n
        for (int i = 2 * n - 1; i >= 0; i--) {

        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
    public int[] nextGreaterElements(int[] nums) {
class Solution {