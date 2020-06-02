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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        if (root == null) return res;
        helper(root, sum, out, res);
        return res;
    }

    private void helper(TreeNode node, int sum, List<Integer> out, List<List<Integer>> res) {
    	if (node.left == null && node.right == null) {
    		if (node.val == sum) {
    			out.add(node.val);
    			res.add(new ArrayList<>(out));
    			out.remove(out.size() - 1);
    		}
    		return;
    	}
    	out.add(node.val);
    	if (node.left != null) helper(node.left, sum - node.val, out, res);
    	if (node.right != null) helper(node.right, sum - node.val, out, res);
    	out.remove(out.size() - 1);
    	return;
    }
}