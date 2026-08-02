/**
 * LeetCode #344: Reverse String
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-02T11:46:37.262Z
 */

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while(left <= right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}