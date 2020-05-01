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
    public int kthSmallest(TreeNode root, int k) {
        int cnt = 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode p = root;
        while (p != null || !s.isEmpty()) {
        	while (p != null) {
        		s.push(p);
        		p = p.left;
        	}
        	p = s.peek(); s.pop();
        	++cnt;
        	if (cnt == k) return p.val;
        	p = p.right;
        }
        return 0;
    }
}