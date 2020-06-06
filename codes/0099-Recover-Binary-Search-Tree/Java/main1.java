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
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new LinkedList<TreeNode>();
        List<Integer> vals = new ArrayList<Integer>();
        inorder(root, list, vals);
        Collections.sort(vals);
        for (int i = 0; i < list.size(); ++i) {
        	list.get(i).val = vals.get(i);
        }
    }

    private void inorder(TreeNode root, List<TreeNode> list, List<Integer> vals) {
    	if (root == null) return;
    	inorder(root.left, list, vals);
    	list.add(root);
    	vals.add(root.val);
    	inorder(root.right, list, vals);
    }
}