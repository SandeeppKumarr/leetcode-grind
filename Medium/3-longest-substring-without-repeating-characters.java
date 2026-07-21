/**
 * LeetCode #3: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-21T19:46:47.846Z
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashMap<Character, Integer> chars = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (chars.containsKey(s.charAt(right))) {
                left = Math.max(left, chars.get(s.charAt(right)) + 1);
            }
            chars.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}