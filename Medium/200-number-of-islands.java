/**
 * LeetCode #200: Number of Islands
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-07T14:54:50.185Z
 */

class Solution {
    int[][] dir = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    result++;
                    dfs(i, j, grid);
                }
            }
        }
        return result;
    }
    private void dfs(int row, int col, char[][] grid){
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0 || grid[row][col] == '0') return;
        grid[row][col] = '0';
        for(int[] d : dir){
            dfs(d[0] + row, d[1] + col, grid);
        }
    }
}