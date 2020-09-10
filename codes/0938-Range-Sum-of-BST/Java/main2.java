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

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        helper(root, L, R);
        return sum;
    }

    public void helper(TreeNode root, int L, int R) {
        if (root == null) return;
        if (root.val >= L && root.val <= R) sum += root.val;
        helper(root.left, L, R);
        helper(root.right, L, R);
    }
}