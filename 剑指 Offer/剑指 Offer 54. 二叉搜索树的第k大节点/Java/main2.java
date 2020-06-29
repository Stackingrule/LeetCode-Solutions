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

	int res;
	int k;

    public int kthLargest(TreeNode root, int k) {
    	this.k = k;
    	helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        helper(root.left);
    }
}