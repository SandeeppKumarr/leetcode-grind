/**
 * LeetCode #74: Search a 2D Matrix
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:47:14.222Z
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = (matrix.length * matrix[0].length) - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int mid2 = mid % matrix[0].length;
            int mid1 = mid / matrix[0].length;
            if(matrix[mid1][mid2] == target) return true;
            else if(matrix[mid1][mid2] < target) left = mid + 1;
            else right = mid - 1;
        } 
        return false;
    }
}