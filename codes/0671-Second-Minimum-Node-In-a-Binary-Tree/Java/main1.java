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
    public int findSecondMinimumValue(TreeNode root) {
        return helper(root, root.val);
    }

    public int helper(TreeNode node, int first) {
        if (node == null) return -1;
        if (node.val != first) return node.val;
        int left = helper(node.left, first), right = helper(node.right, first);
        return (left == -1 || right == -1) ? Math.max(left, right) : Math.min(left, right);
    }
}