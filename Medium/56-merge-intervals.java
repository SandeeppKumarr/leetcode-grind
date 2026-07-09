/**
 * LeetCode #56: Merge Intervals
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-09T04:45:21.891Z
 */

class Solution {
    public int[][] merge(int[][] intervals) {
        //sort based on start time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        // This is what the lambda syntax replaces:
        // Arrays.sort(intervals, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] a, int[] b) {
        //         return Integer.compare(a[0], b[0]);
        //     }
        // });
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            // Overlap condition: current start <= previous end
            if(intervals[i][0] <= prev[1]){
                // Merge intervals
                prev[1] = Math.max(prev[1], intervals[i][1]);
            }
            else{
                // No overlap, add previous interval to result
                merged.add(prev); 
                prev = intervals[i];
            }
        }
        merged.add(prev); // Add the last interval
        return merged.toArray(new int[merged.size()][]);
    }
}