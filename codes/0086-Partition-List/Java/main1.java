/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
将所有小于给定值的节点取出组成一个新的链表，
此时原链表中剩余的节点的值都大于或等于给定值，
只要将原链表直接接在新链表后即可
*/
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode newDummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy, p = newDummy;
        while (cur.next != null) {
        	if (cur.next.val < x) {
        		p.next = cur.next;
        		p = p.next;
        		cur.next = cur.next.next;
        		p.next = null;
        	} else {
        		cur = cur.next;
        	}
        }
        p.next = dummy.next;
        return newDummy.next;
    }
}