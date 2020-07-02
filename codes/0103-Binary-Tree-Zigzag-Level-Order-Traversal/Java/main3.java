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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	if (root == null) return res;
    	Deque<TreeNode> q = new LinkedList<>();
    	q.addLast(root);
    	int height = 1;
    	while (q.size() > 0) {
    		List<Integer> sub = new ArrayList<>();
    		int n = q.size();
    		while (n-- > 0) {
    			TreeNode t = q.removeFirst();
    			if (height % 2 == 1) {
    				sub.add(t.val);
    			}
    			else {
    				sub.add(0, t.val);
    			}

    			if (t.left != null) q.addLast(t.left);
    			if (t.right != null) q.addLast(t.right);
    		}
    		++height;
    		res.add(sub);
    	}
    	return res;
    }
}