/**
 * LeetCode #88: Merge Sorted Array
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-09T04:45:56.427Z
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int last = nums1.length - 1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]) nums1[last--] = nums1[p1--];
            else nums1[last--] = nums2[p2--];
        }
    }
}