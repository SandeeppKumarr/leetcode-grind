/**
 * LeetCode #1209: Remove All Adjacent Duplicates in String II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-08T08:33:12.693Z
 */

class Solution {

    class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Stack is empty OR top character is different
            if (st.isEmpty() || st.peek().ch != c) {
                st.push(new Pair(c, 1));
            }

            // Same character as top
            else {
                st.peek().count++;

                // We have k duplicates
                if (st.peek().count == k) {
                    st.pop();
                }
            }
        }

        // Build answer from stack
        StringBuilder ans = new StringBuilder();

        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                ans.append(p.ch);
            }
        }

        return ans.toString();
    }
}