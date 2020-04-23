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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root != null) helper(root, "", res);
        return res;
    }

    private void helper(TreeNode root, String out, List<String> res) {
    	if (root.left == null && root.right == null) res.add(out + root.val);
    	if (root.left != null) helper(root.left, out + root.val + "->", res);
    	if (root.right != null) helper(root.right, out + root.val + "->", res);
    }
}