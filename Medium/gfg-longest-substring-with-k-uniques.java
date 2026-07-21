/**
 * GeeksForGeeks: Longest Substring with K Uniques
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-22T00:04:44.074Z
 */
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int maxLength = -1;
        int left = 0;
        HashMap<Character, Integer> chars = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            chars.put(s.charAt(right), chars.getOrDefault(s.charAt(right), 0) + 1);
            if(chars.size() == k) maxLength = Math.max(maxLength, right - left + 1);
            while(chars.size() > k){
                chars.put(s.charAt(left), chars.get(s.charAt(left)) - 1);
                if(chars.get(s.charAt(left)) == 0) chars.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
