/**
 * LeetCode #387: First Unique Character in a String
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-04T11:35:03.085Z
 */

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(freq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}