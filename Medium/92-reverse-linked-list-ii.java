/**
 * LeetCode #92: Reverse Linked List II
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-08-05T06:14:05.819Z
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Move prev to the node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode tail = curr;

        // Reverse from left to right
        ListNode next = null;
        ListNode revPrev = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = revPrev;
            revPrev = curr;
            curr = next;
        }

        // Reconnect
        prev.next = revPrev;
        tail.next = curr;

        return dummy.next;
    }
}