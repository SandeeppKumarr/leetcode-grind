/**
 * LeetCode #56: Merge Intervals
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-29T20:15:52.324Z
 */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] inserted = new int[intervals.length + 1][2];
        boolean insert = false;
        int j = 0;
        if (!insert && (j == intervals.length || intervals[j][0] > newInterval[0])) {
                inserted[i][0] = newInterval[0];
                inserted[i][1] = newInterval[1];
                insert = true;
            } else {
                inserted[i][0] = intervals[j][0];
                inserted[i][1] = intervals[j][1];
                j++;
            }
        }
        List<int[]> merged = new ArrayList<>();
        int[] prev = inserted[0];

        for (int i = 1; i < inserted.length; i++) {
            if (inserted[i][0] <= prev[1]) {
                prev[1] = Math.max(prev[1], inserted[i][1]);
            } else {
                merged.add(prev);
                prev = inserted[i];
            }
        }

        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}