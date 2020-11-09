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
    int res = 0;

    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return res;
        }

        dfs(root, root.val, root.val);
        return res;
    }

    private void dfs(TreeNode root, int min, int max){
        if(root == null){
            return;
        }

        res = Math.max(res, Math.max(Math.abs(root.val - min), Math.abs(max-root.val)));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        dfs(root.left, min, max);
        dfs(root.right, min, max);
    }
}