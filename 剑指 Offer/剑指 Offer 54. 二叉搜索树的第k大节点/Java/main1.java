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
    public int kthLargest(TreeNode root, int k) {
    	List<Integer> res = new ArrayList<>();
    	inorder(root, res);
    	return res.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> res) {
    	if (root == null) return;
        inorder(root.right, res);
    	res.add(root.val);
        inorder(root.left, res);
    }
}