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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub;
        if (root == null) return res;
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        while (level.size() > 0) {
        	sub = new ArrayList<>();
        	int numLevel = level.size();
        	for (int i = 0; i < numLevel; ++i) {
	        	TreeNode cur = level.poll();
	        	if (cur.left != null) level.add(cur.left);
	        	if (cur.right != null) level.add(cur.right);
	        	sub.add(cur.val);
        	}
        	res.add(sub);

        }

        return res;
    }
}