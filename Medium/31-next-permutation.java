/**
 * LeetCode #31: Next Permutation
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-08T17:34:17.267Z
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        int smallestAhead = -1;

        //find the breakpoint
        for(int i = nums.length - 2; i > -1; i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }

        //if no breakPoint, reverse the entire array
        if(breakPoint == -1) reverse(nums, 0);

        //otherwise, find the smallest element that is greater than nums[i] and is in the right of i
        else{
            for(int i = nums.length - 1; i > breakPoint ; i--){
                if(nums[i] > nums[breakPoint]){ //the subarray ahead of breakPoint is already in decreasing order!
                    smallestAhead = i;
                    break;
                }
            }

            //swap the element at breakPoint with the element at smallestAhead
            swap(nums, breakPoint, smallestAhead);

            //reverse the subarray in front of breakPoint
            reverse(nums, breakPoint + 1);
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start){
        int left = start;
        int right = arr.length - 1;
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    } 
}