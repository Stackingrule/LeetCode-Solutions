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
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        int len = 0;
        for (ListNode node = root; node != null; node = node.next) ++len;
    	int avg = len / k, ext = len % k;
    	for (int i = 0; i < k && root != null; ++i) {
    		res[i] = root;
    		for (int j = 1; j < avg + (i < ext ? 1 : 0); ++j) {
    			root = root.next;
    		}
    		ListNode t = root.next;
    		root.next = null;
    		root = t;
    	}
    	return res;
    }
}