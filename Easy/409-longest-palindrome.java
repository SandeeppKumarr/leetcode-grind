/**
 * LeetCode #409: Longest Palindrome
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-05T05:45:45.957Z
 */

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        for (int count : freq) {
            length += (count / 2) * 2; //for even we add count, and for odd it will become count - 1
            if (length % 2 == 0 && count % 2 == 1) { //basically if we have not yet added middle character & current count can spare 1
                length++;
            }
        }

        return length;
    }
}