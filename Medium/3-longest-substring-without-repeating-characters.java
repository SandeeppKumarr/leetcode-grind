/**
 * LeetCode #3: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-21T19:42:05.255Z
 */

public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < n; right++) {

            if (lastIndex.containsKey(s.charAt(right))) {
                left = Math.max(left, lastIndex.get(s.charAt(right)) + 1);
            }

            lastIndex.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
