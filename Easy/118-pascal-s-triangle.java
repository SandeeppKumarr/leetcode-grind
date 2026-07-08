/**
 * LeetCode #118: Pascal's Triangle
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-08T17:33:44.074Z
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal =  new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = new ArrayList<>();
            if(i > 1){
                prevRow = pascal.get(i - 1);
            }
            for(int j = 0; j < i + 1; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}