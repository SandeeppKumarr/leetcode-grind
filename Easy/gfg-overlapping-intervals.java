/**
 * GeeksForGeeks: Overlapping Intervals
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-31T18:16:44.074Z
 */
class Solution {
    static boolean isIntersect(int[][] intervals) {
        // Code Here
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] prev = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= prev[1]){
                return true;
            }
            prev = intervals[i];
        }
        return false;
    }
}
