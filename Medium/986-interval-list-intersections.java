/**
 * LeetCode #986: Interval List Intersections
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-30T07:25:56.981Z
 */

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0, j = 0;
        List<int[]> res = new ArrayList<>();
        while(i < firstList.length && j < secondList.length){
            if(firstList[i][0] < secondList[j][0]){
                if(firstList[i][1] >= secondList[j][0]){
                    int[] overlap = new int[2];
                    overlap[0] = Math.max(firstList[i][0], secondList[j][0]);
                    overlap[1] = Math.min(firstList[i][1], secondList[j][1]);
                    res.add(overlap);
                }
            }
            else{
                if(secondList[j][1] >= firstList[i][0]){
                    int[] overlap = new int[2];
                    overlap[0] = Math.max(firstList[i][0], secondList[j][0]);
                    overlap[1] = Math.min(firstList[i][1], secondList[j][1]);
                    res.add(overlap);
                }
            }
            if(firstList[i][1] > secondList[j][1]) j++;
            else i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}