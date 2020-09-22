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

    int ans = 0;
    private int dfs(TreeNode root) {
        if (root.left == null && root.right == null) return 0;
        int needCamera = 0;
        int covered = 0;
        if (root.left != null) {
            int state = dfs(root.left);
            if (state == 0) needCamera = 1;
            if (state == 1) covered = 1;
        }
        if (root.right != null) {
            int state = dfs(root.right);
            if (state == 0) needCamera = 1;
            if (state == 1) covered = 1;
        }
        if (needCamera > 0) {
            ans++;
            return 1;
        }
        if (covered > 0) return 2;
        return 0;
    }
    public int minCameraCover(TreeNode root) {
        int state = dfs(root);
        if (state == 0) ans++;
        return ans;
    }
}