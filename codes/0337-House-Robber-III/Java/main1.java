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
    public int rob(TreeNode root) {
        HashMap<TreeNode, Integer> m = new HashMap<>();
        return dfs(root, m);
    }

    public int dfs(TreeNode root, HashMap<TreeNode, Integer> m) {
        if (root == null) return 0;
        if (m.containsKey(root)) return m.get(root);
        int val = 0;
        if (root.left != null) {
            val += dfs(root.left.left, m) + dfs(root.left.right, m);
        }
        if (root.right != null) {
            val += dfs(root.right.left, m) + dfs(root.right.right, m);
        }
        val = Math.max(val + root.val, dfs(root.left, m) + dfs(root.right, m));
        m.put(root, val);
        return val;
    }
}