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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int diff = depth(root.left) - depth(root.right);
        return (diff == 0) ? root : subtreeWithAllDeepest(diff > 0 ? root.left : root.right);
    }

    public int depth(TreeNode node) {
        return (node == null ? 0 : Math.max(depth(node.left), depth(node.right)) + 1);
    }
}