/**
 * LeetCode #215: Kth Largest Element in an Array
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-09T10:32:45.151Z
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < k; i++){
            minHeap.offer(nums[i]);
        }
        for(int i = k; i < nums.length; i++){
            if(nums[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }
}