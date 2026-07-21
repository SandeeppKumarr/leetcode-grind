/**
 * LeetCode #3: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-21T19:43:24.490Z
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastIndex.containsKey(c)) {
                left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}