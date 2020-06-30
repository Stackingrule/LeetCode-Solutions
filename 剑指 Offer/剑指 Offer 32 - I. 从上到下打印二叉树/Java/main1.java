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
    public int[] levelOrder(TreeNode root) {
    	if (root == null) return new int[0];
    	List<Integer> list = new ArrayList<>();
    	Deque<TreeNode> q = new LinkedList<>();
    	q.addLast(root);
    	while (q.size() > 0) {
    		TreeNode t = q.pollFirst();
    		list.add(t.val);
    		if (t.left != null) q.addLast(t.left);
    		if (t.right != null) q.addLast(t.right);
    	}

    	int[] res = new int[list.size()];
    	for (int i = 0; i < list.size(); ++i) {
    		res[i] = list.get(i);
    	}
    	return res;
    }
}