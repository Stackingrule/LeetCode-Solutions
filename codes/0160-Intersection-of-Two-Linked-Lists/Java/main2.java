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
        int len_A = get_list_len(headA);
        int len_B = get_list_len(headB);
        if (len_A > len_B) {
            headA = forward_long_list(len_A, len_B, headA);
        }
        else {
            headB = forward_long_list(len_B, len_A, headB);
        }

        while ((headA != null) && (headB != null)) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int get_list_len(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    private ListNode forward_long_list(int long_len, int short_len, ListNode head) {
        int delta = long_len - short_len;
        while ((head != null) && (delta >0)) {
            head = head.next;
            delta--;
        }
        return head;
    }
}