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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.next != null) {
        	ListNode tmp = pre.next;
        	pre.next = cur.next;
        	cur.next = cur.next.next;
        	pre.next.next = tmp;
        	cur = cur.next;
        	pre = pre.next;
        }
        return head;
    }
}