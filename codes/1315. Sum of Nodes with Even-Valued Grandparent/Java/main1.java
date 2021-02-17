/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null)
            return 0;
        return dfs(root, null, null);
    }

    private int dfs(TreeNode root, TreeNode parent, TreeNode grandParent) {
        if (root == null) return 0;
        int sum = 0;
        if ((grandParent != null) && ((grandParent.val & 1) == 0))
            sum = root.val;
        return sum + dfs(root.left, root, parent) + dfs(root.right, root, parent);
    }
}