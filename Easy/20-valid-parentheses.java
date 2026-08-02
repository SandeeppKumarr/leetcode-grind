/**
 * LeetCode #20: Valid Parentheses
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-02T11:33:32.128Z
 */

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> paran = new HashMap<>();
        paran.put(')', '(');
        paran.put(']', '[');
        paran.put('}', '{');
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            int size = sb.length();
            if(size > 0 && sb.charAt(size - 1) == paran.getOrDefault(c, c)) sb.deleteCharAt(size - 1);
            else sb.append(c);
        }
        return sb.length() > 0 ? false : true;
    }
}