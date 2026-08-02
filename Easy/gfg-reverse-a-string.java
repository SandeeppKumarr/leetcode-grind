/**
 * GeeksForGeeks: Reverse a String
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-08-02T17:16:44.074Z
 */
class Solution {
    public static String reverseString(String s) {
        // code here
        int left = 0, right = s.length() - 1;
        StringBuilder res = new StringBuilder(s);
        while(left < right){
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
        return res.toString();
    }
}
