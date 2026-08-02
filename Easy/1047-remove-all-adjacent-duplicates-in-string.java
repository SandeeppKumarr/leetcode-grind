/**
 * LeetCode #1047: Remove All Adjacent Duplicates In String
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-02T11:23:06.202Z
 */

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            int size = sb.length();
            if(size > 0 && sb.charAt(size - 1) == c) sb.deleteCharAt(size - 1);
            else sb.append(c);
        }
        return sb.toString();
    }
}