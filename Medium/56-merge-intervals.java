/**
 * LeetCode #56: Merge Intervals
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T20:24:16.048Z
 */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for (int[] current : intervals) {
            if (current[1] < newInterval[0]) {
                res.add(current);
            }
            else if (current[0] > newInterval[1]) {
                res.add(newInterval);
                newInterval = current;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }
        res.add(newInterval);

        return res.toArray(new int[res.size()][]);
    }
}