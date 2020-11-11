/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        ArrayList<ListNode> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(tree);
        while (!q.isEmpty()) {
            int sz = q.size();
            ListNode dummy = new ListNode(-1);
            ListNode p = dummy;
            while (sz-- > 0) {
                TreeNode cur = q.poll();
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
                p.next = new ListNode(cur.val);
                p = p.next;
            }
            list.add(dummy.next);
        }

        ListNode[] ans = new ListNode[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}