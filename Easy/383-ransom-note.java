/**
 * LeetCode #383: Ransom Note
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-05T05:51:31.255Z
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char c : magazine.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            freq[c - 'a']--;
            if(freq[c - 'a'] < 0) return false;
        }
        return true;
    }
}