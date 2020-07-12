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
        ListNode node = headA;
        Set<ListNode> set = new HashSet<>();
        while(node!=null){
            set.add(node);
            node = node.next;
        }
        node = headB;
        while(node!=null){
            if(set.contains(node)){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
