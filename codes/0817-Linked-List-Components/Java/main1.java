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
    public int numComponents(ListNode head, int[] G) {
        int res = 0;
        HashSet<Integer> nodeSet = new HashSet<>();
        for (int num : G) {
            nodeSet.add(num);
        }
        while (head != null) {
            if (nodeSet.contains(head.val) && (head.next == null || !nodeSet.contains(head.next.val))) {
                ++res;
            }
            head = head.next;
        }
        return res;
    }
}