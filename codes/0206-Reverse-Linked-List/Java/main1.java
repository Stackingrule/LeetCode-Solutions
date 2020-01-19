/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    	ListNode new_nead = null;
    	ListNode cur = head;
    	while(cur != null) {
    		ListNode next = cur.next;
    		cur.next = new_nead;
    		new_nead = cur;
    		cur = next;
    	}
        return new_nead;
    }
}