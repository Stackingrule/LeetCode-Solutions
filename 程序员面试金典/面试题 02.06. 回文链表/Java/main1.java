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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
        	stack.push(cur.val);
        	cur = cur.next;
        }
        while (head != null) {
        	int t = stack.pop();
        	if (t != head.val) return false;
        	head = head.next;
        }
        return true;
    }
}