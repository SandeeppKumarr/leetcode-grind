/**
 * LeetCode #409: Longest Palindrome
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-05T05:40:01.244Z
 */

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        int result = 0;
        boolean hasOdd = false;
        for(int count : freq.values()){
            if(count % 2 == 0) result += count;
            else{
                result += count - 1;
                hasOdd = true;
            }
        }
        if(hasOdd) result++;
        return result;
    }
}