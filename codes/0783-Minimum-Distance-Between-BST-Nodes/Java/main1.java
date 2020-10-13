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
    public int minDiffInBST(TreeNode root) {
        int res = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        for (int i = 1; i < list.size(); ++i) {
            res = Math.min(res, list.get(i) - list.get(i - 1));
        }
        return res;
    }

    private void helper(TreeNode node, List<Integer> val) {
        if (node == null) return;
        helper(node.left, val);
        val.add(node.val);
        helper(node.right, val);
    }
}