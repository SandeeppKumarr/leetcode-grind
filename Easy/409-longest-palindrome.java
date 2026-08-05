/**
 * LeetCode #409: Longest Palindrome
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-05T05:41:36.164Z
 */

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        for (int count : freq) {
            length += (count / 2) * 2;
            if (length % 2 == 0 && count % 2 == 1) {
                length++;
            }
        }

        return length;
    }
}