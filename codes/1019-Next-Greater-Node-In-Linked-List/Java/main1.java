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
    public int[] nextLargerNodes(ListNode head) {
        // 异常处置部分
        if (head == null ) return null;
        int n = 0;
        ListNode p = head;
        while(p != null){
            p = p.next;
            n++;
        }
        if (n == 0 ) return null;
        // 以上
        int []result = new int[n];
        ListNode tail = head;
        // i来标记返回数组的位置，以tail是同步的
        int i = 0;
        // tail 为 node_i
        while(tail != null){
            int max = 0;
            p = tail;
            // p 为 node_j
            while(p != null){
                if (p.val > tail.val){
                    max = p.val;
                    break;
                }
                p=p.next;
            }
            // 如果存在较大值 则max就是，不存在 则max默认为0；
            result[i] = max;
            i++;
            tail = tail.next;
        }
        return result;
    }
}