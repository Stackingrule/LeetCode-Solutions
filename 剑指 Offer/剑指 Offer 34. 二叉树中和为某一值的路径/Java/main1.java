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

	List<List<Integer>> res = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

    	if (root == null) return res;
    	sum -= root.val;
    	path.add(root.val);

    	if (sum == 0 && root.left == null && root.right == null) {
    		res.add(new ArrayList<>(path));
    	}

    	pathSum(root.left, sum);
    	pathSum(root.right, sum);

    	path.remove(path.size() - 1);

    	return res;
    }
}