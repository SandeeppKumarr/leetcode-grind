/**
 * LeetCode #11: Container With Most Water
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-07T07:37:33.423Z
 */

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, area = 1;
        while(left < right){
            area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]) left++;
            else right--;
        }
        return area;
    }
}