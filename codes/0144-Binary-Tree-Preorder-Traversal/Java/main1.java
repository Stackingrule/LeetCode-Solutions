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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
        	TreeNode t = stack.pop();
        	res.add(t.val);
            if (t.right != null) stack.push(t.right);
        	if (t.left != null) stack.push(t.left);        	
        }
        return res;
    }
}