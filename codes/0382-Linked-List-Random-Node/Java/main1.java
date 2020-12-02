/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    ListNode head;
    Random random;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode iter = this.head;
        int res = iter.val;

        iter = iter.next;
        int n = 1;
        while(iter != null) {
            ++n;
            if(random.nextInt(n) == 0) {
                res = iter.val;
            }
            iter = iter.next;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */