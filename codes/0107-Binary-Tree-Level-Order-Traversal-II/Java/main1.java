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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
        	return res;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
        	List<Integer> list = new ArrayList<>();
            int size = queue.size();
        	for (int i = 0; i < size; ++i) {               
        		final TreeNode node = queue.poll();
        		list.add(node.val);
        		if (node.left != null) {
        			queue.offer(node.left);
        		}
        		if (node.right != null) {
        			queue.offer(node.right);
        		}
        	}
        	res.add(0, list);
        }
        return res;
    }
}