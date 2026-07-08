/**
 * LeetCode #73: Set Matrix Zeroes
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-08T17:32:46.194Z
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Tracks whether the first column originally contained a 0.
        // We need this because matrix[0][0] is already being used
        // as a marker and cannot uniquely represent the first column.
        boolean firstCol = false;

        // Check if the first column needs to be zeroed later.
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }

        // Use the first row and first column as marker arrays.
        // If matrix[i][j] == 0, mark:
        //   - row i by setting matrix[i][0] = 0
        //   - column j by setting matrix[0][j] = 0
        for(int i = 0; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out all marked columns.
        for(int j = 1; j < n; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out all marked rows.
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // Finally handle the first column separately.
        if(firstCol == true){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}