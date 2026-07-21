/**
 * GeeksForGeeks: Max Sum Subarray of Size K
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-21T21:16:44.074Z
 */
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int left = 0;
        int right = left + k - 1;
        int currSum = 0;
        for(int i = 0; i < k; i++){
            currSum += arr[i];
        }
        int maxSum = currSum;
        while(right + 1 < arr.length){
            currSum = currSum - arr[left] + arr[right + 1];
            maxSum = Math.max(maxSum, currSum);
            left++;
            right++;
        }
        return maxSum;
    }
}
