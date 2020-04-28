/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> m = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            m.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            m.get(cur).next = m.get(cur.next);
            m.get(cur).random = m.get(cur.random);
            cur = cur.next;
        }
        return m.get(head);
    }
}