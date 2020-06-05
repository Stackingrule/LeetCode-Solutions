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
    public int maxPathSum(TreeNode root) {
        int res = Integer.MIN_VALUE;
        maxPathSum(root, res);
        return res;
    }

    private int maxPathSum(TreeNode node, int res) {
    	if (node == null) return 0;
    	int left = Math.max(0, maxPathSum(node.left, res));
    	int right = Math.max(0, maxPathSum(node.right, res));
    	res = Math.max(res, left + right + node.val);
    	return Math.max(left, right) + node.val;
    }
}