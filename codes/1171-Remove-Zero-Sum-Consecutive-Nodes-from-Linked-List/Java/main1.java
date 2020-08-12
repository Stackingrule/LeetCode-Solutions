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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(1000 * 1000 + 1);
        dummy.next = head;
        ListNode prevL = dummy, l = head, r = head;
        
        while(l != null) {
            r = l;
            int sum = 0;
            boolean skip = false;
            while(r != null) {
                sum += r.val;
                if(sum == 0) {  
                    prevL.next = r.next;
                    l = r;
                    skip = true;
                    break;
                }
                r = r.next;
            }
            if(!skip) {
                prevL = l;
            }            
            l = l.next;
        }
        return dummy.next;
    }
}