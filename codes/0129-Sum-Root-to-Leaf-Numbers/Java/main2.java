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
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while (!st.empty()) {
        	TreeNode t = st.peek(); st.pop();
        	if (t.left == null && t.right == null) {
        		res += t.val;
        	}
        	if (t.right != null) {
        		t.right.val += t.val * 10;
        		st.push(t.right);
        	}
        	if (t.left != null) {
        		t.left.val += t.val * 10;
        		st.push(t.left);
        	}
        }
        return res;
    }
}