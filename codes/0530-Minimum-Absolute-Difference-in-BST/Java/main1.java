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

	int res = Integer.MAX_VALUE;
	int pre = -1;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return res;
    }

    private void inorder(TreeNode root) {
    	if (root == null) return;
    	inorder(root.left);
    	if (pre != -1) res = Math.min(res, root.val - pre);
    	pre = root.val;
    	inorder(root.right);
    }
}