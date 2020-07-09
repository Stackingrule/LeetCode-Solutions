/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,rear = null;
        boolean upFlag = false;
        while (l1 != null || l2 != null) {

            int sum = 0;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if(upFlag) {
                sum += 1;
                upFlag = false;
            }

            int nodeNum = sum % 10;
            if(sum > 9) {
                upFlag = true;
            }

            //挂节点
            if(head == null) {
                head = rear = new ListNode(nodeNum);
            }else {
                ListNode rearNode = new ListNode(nodeNum);
                rear = rear.next = rearNode;
            }
        }
        if(upFlag) {
            rear.next = new ListNode(1);
        }
        return head;
    }
}
