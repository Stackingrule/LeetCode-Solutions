/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.peek() != null) {
        	TreeNode cur = q.poll();
        	q.add(cur.left);
        	q.add(cur.right);
        }
        while (!q.isEmpty() && q.peek() == null) {
        	q.poll();
        }
        return q.isEmpty();
    }
}