/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
          //快慢指针

        if(head != null && head.next != null) {

            ListNode fast = head;

            ListNode slow = head;

            fast = fast.next.next;
            slow = slow.next;
            while (fast != slow && fast != null && slow != null) {
                if(fast.next == null) {
                    return null;
                }
                fast = fast.next.next;
                slow = slow.next;
            }

            if(fast != null && slow != null) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }

        }

        return null;
    }
}