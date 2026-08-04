/**
 * LeetCode #387: First Unique Character in a String
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-04T11:36:04.242Z
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}