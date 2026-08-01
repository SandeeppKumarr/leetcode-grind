/**
 * GeeksForGeeks: Meeting Rooms II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-1T13:16:44.074Z
 */
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0, j = 0, rooms = 0, result = 0;
        while(i < start.length){
            if(start[i] < end[j]){
                rooms++;
                i++;
                result = Math.max(result, rooms);
            }
            else{
                rooms--;
                j++;
            }
        }
        return result;
    }
}
