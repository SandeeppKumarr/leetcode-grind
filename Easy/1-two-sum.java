/**
 * LeetCode #1: Two Sum
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-14T15:15:46.041Z
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while(l < r){
            if((numbers[l] + numbers[r]) == target) return new int[]{l+1, r+1};
            else if((numbers[l] + numbers[r]) > target) r--;
            else l++;
        }
        return new int[]{0,0};
    }
}