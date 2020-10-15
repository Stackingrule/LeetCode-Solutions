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

    int total;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        total = 0;
        helper(root, n, x);
        return total > n / 2;
    }

    private int helper(TreeNode node, int n, int x) {
        if (node == null) return 0;
        int ls = helper(node.left, n, x);
        int rs = helper(node.right, n, x);

        if (node.val == x) {
            total = Math.max(Math.max(ls, rs), n - ls - rs - 1);
        }

        return ls + rs + 1;
    }
}