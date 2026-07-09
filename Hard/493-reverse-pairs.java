/**
 * LeetCode #493: Reverse Pairs
 * Difficulty: Hard
 * Language: Java
 * Date: 2026-07-09T04:48:21.080Z
 */

class Solution {
    public int merge(int[] nums, int left, int mid, int right){
        int count = 0;
        int n = mid - left + 1;
        int m = right - mid;
        int[] L = new int[n];
        int[] R = new int[m];
        for(int i = 0; i < n; i++){
            L[i] = nums[left + i];
        }
        for(int i = 0; i < m; i++){
            R[i] = nums[mid + 1 + i];
        }
        int l = 0, r = 0;
        while(l < n && r < m){
            if((long)L[l] > 2L * R[r]){
                r++;
            }
            else{
                count += r;
                l++;
            }
        }
        while(l < n){
            count += r;
            l++;
        } 
        int i = 0, j = 0;
        int k = left;
        while(i < n && j < m){
            if(L[i] < R[j]){
                nums[k++] = L[i++];
            }
            else{
                nums[k++] = R[j++];
            }
        }
        while(i < n) nums[k++] = L[i++];
        while(j < m) nums[k++] = R[j++];
        return count;
    }
    public int mergeSort(int [] nums, int left, int right){
        int count = 0;
        if(left < right){
            int mid = left + (right - left) / 2;
            count += mergeSort(nums, left, mid);
            count += mergeSort(nums, mid + 1, right);
            count += merge(nums, left, mid, right);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        int count = 0;
        count += mergeSort(nums, 0, nums.length - 1);
        return count;
    }
}