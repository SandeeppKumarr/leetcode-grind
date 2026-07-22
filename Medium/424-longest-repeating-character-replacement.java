/**
 * LeetCode #424: Longest Repeating Character Replacement
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-22T06:32:05.034Z
 */

class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int left = 0;
        int maxCount = 0;
        Map<Character, Integer> chars = new HashMap<>();
        for(int right = 0; right < s.length(); right ++){
            chars.put(s.charAt(right), chars.getOrDefault(s.charAt(right), 0) + 1);
            maxCount = Math.max(maxCount, chars.get(s.charAt(right)));
            if((right - left + 1 - maxCount) > k){
                chars.put(s.charAt(left), chars.get(s.charAt(left)) - 1);
                if(chars.get(s.charAt(left)) == 0) chars.remove(s.charAt(left));
                left++;
            }
            else maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}