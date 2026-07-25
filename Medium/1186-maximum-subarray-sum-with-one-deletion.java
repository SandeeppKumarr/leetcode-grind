/**
 * LeetCode #1186: Maximum Subarray Sum with One Deletion
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-25T20:01:36.894Z
 */

class Solution {
    public int maximumSum(int[] arr) {
        int keep = arr[0], deleted = Integer.MIN_VALUE, result = arr[0];
        for(int i = 1; i < arr.length; i++){
            int prevKeep = keep;
            int prevDeleted = deleted;
            deleted = Math.max(
                prevKeep,
                prevDeleted == Integer.MIN_VALUE
                    ? Integer.MIN_VALUE
                    : prevDeleted + arr[i]
            );
            keep = Math.max(arr[i], prevKeep + arr[i]);
            result = Math.max(result, Math.max(keep, deleted));
        }
        return result;
    }
}