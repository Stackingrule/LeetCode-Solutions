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

    TreeNode prev = new TreeNode(-1);

    public TreeNode convertBiNode(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        prev = dummy;
        dfs(root);
        return dummy.right;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        node.left = null;
        prev.right = node;
        prev = node;
        dfs(node.right);
    }
}