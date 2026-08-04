/**
 * LeetCode #1189: Maximum Number of Balloons
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-04T11:44:46.608Z
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'a']++;
        }
        int result = Integer.MAX_VALUE;
        result = Math.min(result, freq['b' - 'a']);
        result = Math.min(result, freq['a' - 'a']);
        result = Math.min(result, freq['l' - 'a'] / 2);
        result = Math.min(result, freq['o' - 'a'] / 2);
        result = Math.min(result, freq['n' - 'a']);
        return result;
    }  
}