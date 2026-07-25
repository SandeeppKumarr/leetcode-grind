/**
 * LeetCode #1186: Maximum Subarray Sum with One Deletion
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T20:16:41.087Z
 */

class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length, maxNoDelete = arr[0], maxOneDelete = arr[0], result = arr[0];
        for (int i = 1; i < n; i++) {
            int prevNoDelete = maxNoDelete;
            maxNoDelete = Math.max(maxNoDelete + arr[i], arr[i]);
            maxOneDelete = Math.max(maxOneDelete + arr[i], prevNoDelete);
            result = Math.max(result, Math.max(maxNoDelete, maxOneDelete));
        }       
        return result;
    }
}