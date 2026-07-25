/**
 * GeeksForGeeks: Insertion at a Given Position in a Linked List
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-25T18:16:44.074Z
 */
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node node = new Node(val);
        
        if (pos == 1) {
            node.next = head;
            return node;
        }
        
        Node currPos = head;
        
        for (int i = 0; i < pos - 2; i++) {
            currPos = currPos.next;
        }
        
        node.next = currPos.next;
        currPos.next = node;
        
        return head;
    }
}
