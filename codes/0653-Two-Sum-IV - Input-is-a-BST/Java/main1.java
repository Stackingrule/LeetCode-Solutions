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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> st = new HashSet<>();
        return helper(root, k, st);
    }

    public boolean helper(TreeNode root, int k, HashSet<Integer> st) {
        if (root == null) return false;
        if (st.contains(k - root.val)) return true;
        st.add(root.val);
        return helper(root.left, k, st) || helper(root.right, k, st);
    }
}