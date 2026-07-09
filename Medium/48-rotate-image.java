/**
 * LeetCode #48: Rotate Image
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:45:08.421Z
 */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n - i - 1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
        //another solution is to just transpose and then reverse each row!
        //for(int i = 0; i < n; i++){
        //   for(int j = i + 1; j < n; j++){
        //      swap(matrix[i][j], matrix[j][i]);
        //   }
        //}
        // now reverse:
        //for(int[] row : matrix){
        //   reverse(row);
        //}
    }
}