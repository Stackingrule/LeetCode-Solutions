/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
    	if (t1 == null) return false;
    	if (isSame(t1, t2)) return true;
    	return checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
    	if (p == null && p == null) return true;
    	if (p == null || q == null) return false;
    	if (p.val != q.val) return false;
    	return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}