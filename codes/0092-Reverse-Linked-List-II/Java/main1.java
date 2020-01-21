/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	int change_len = n - m + 1;
    	ListNode result = head;
    	ListNode pre_head = null;
    	while (head && --m) {
    		pre_head = head;
    		head = head.next;
    	}

    	ListNode modify_list_tail = head;
    	ListNode new_head = null;
    	while (head && change_len) {
    		ListNode next = head.next;
    		new_head.next = head;
    		head = next;
    		change_len--;
    	}
    	modify_list_tail.next = head;
    	if (pre_head) {
    		pre_head.next = new_head;
    	}
    	else {
    		result = new_head;
    	}
    	return result;
        
    }
}