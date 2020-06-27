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
    public boolean isBalanced(TreeNode root) {
    	if (root == null) return true;
    	int left, right;
    	left = getDepth(root.left);
    	right = getDepth(root.right);
    	if (Math.abs(left - right) < 2) {
    		return isBalanced(root.left) && isBalanced(root.right);
    	}
    	else {
    		return false;
    	}
    }

    public int getDepth(TreeNode node) {
    	if (node == null) return 0;
    	return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }
}