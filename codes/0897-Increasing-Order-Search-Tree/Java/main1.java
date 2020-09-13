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
    public TreeNode increasingBST(TreeNode root) {
        return helper(root, null);
    }

    TreeNode helper(TreeNode node, TreeNode pre) {
        if (node == null) return pre;
        TreeNode res = helper(node.left, node);
        node.left = null;
        node.right = helper(node.right, pre);
        return res;
    }
}