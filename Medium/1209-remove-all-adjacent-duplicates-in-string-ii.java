/**
 * LeetCode #1209: Remove All Adjacent Duplicates in String II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-07T16:12:06.827Z
 */

class Solution {
    public String removeDuplicates(String s, int k) {
        int[] count = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int size = sb.length();
            if(size > 0 && sb.charAt(size - 1) == ch){
                count[size] = count[size - 1] + 1;
            }
            else count[size] = 1;
            if(count[size] == k){
                for(int i = 0; i < k - 1; i++){
                    sb.deleteCharAt(size - i - 1);
                    count[size] = 0;
                }
            }
            else sb.append(ch);
            System.out.println(sb.toString());
        }
        return sb.toString();
    }
}