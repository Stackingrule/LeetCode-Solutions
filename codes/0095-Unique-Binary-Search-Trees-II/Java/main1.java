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
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int l, int r) {
    	List<TreeNode> res = new ArrayList<>();
    	if (l > r) {
    		res.add(null);
    		return res;
    	}
    	for (int i = l; i <= r; ++i) {
    		for (TreeNode left : generateTrees(l, i - 1)) {
    			for (TreeNode right : generateTrees(i + 1, r)) {
    				TreeNode root = new TreeNode(i);
    				root.left = left;
    				root.right = right;
    				res.add(root);
    			}
    		}
    	}
    	return res;
    }
}