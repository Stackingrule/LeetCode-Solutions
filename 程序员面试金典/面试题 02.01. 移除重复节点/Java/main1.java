/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
    	HashSet<Integer> set = new HashSet<>();
    	ListNode cur = head;
    	while (cur != null && cur.next != null) {
    		set.add(cur.val);
    		if (set.contains(cur.next.val)) {
    			cur.next = cur.next.next;
    		}
    		else {
    			cur = cur.next;
    		}
    	}
    	return head;
    }
}