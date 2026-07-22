/**
 * LeetCode #76: Minimum Window Substring
 * Difficulty: Hard
 * Language: Java
 * Date: 2026-07-22T13:25:11.627Z
 */

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return new String();
        }
        int[] map = new int[128];
        int count = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for(char c : t.toCharArray()){
            map[c]++;
        }

        char[] chS = s.toCharArray();

        for(int right = 0; right < chS.length; right++){
            if(map[chS[right]]-- > 0) count--;
            while(count == 0){
                if((right - left + 1) < minLen){
                    startIndex = left;
                    minLen = right - left + 1;
                }
                if(map[chS[left++]]++ == 0) count++;
            }
        }
        return minLen == Integer.MAX_VALUE ? new String() : new String(chS, startIndex, minLen);
    }
}