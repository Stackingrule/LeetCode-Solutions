/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode curA = headA;
        while (curA != null) {
        	set.add(curA);
        	curA = curA.next;
        }
        while (headB != null) {
        	if (set.contains(headB)) {
        		return headB;
        	}
        	headB = headB.next;
        }
        return null;
    }
}