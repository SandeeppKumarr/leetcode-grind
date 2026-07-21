/**
 * LeetCode #3: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-21T19:26:55.705Z
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> chars = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            if(chars.containsKey(s.charAt(right)) && chars.get(s.charAt(right)) >= left){
                left = chars.get(s.charAt(right)) + 1;
            }
            chars.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}