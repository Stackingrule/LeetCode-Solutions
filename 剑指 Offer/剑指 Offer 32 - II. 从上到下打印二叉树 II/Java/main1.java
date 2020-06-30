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
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	if (root == null) return res;
    	Deque<TreeNode> q = new LinkedList<>();
    	q.addLast(root);
    	while (q.size() > 0) {
    		List<Integer> sub = new ArrayList<>();
    		int n = q.size();
    		while (n-- > 0) {
    			TreeNode t = q.removeFirst();
    			sub.add(t.val);
    			if (t.left != null) q.addLast(t.left);
    			if (t.right != null) q.addLast(t.right);
    		}
    		res.add(sub);
    	}
    	return res;
    }
}