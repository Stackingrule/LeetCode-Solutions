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
    List<Integer> sorted = new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return arrToBST(0, sorted.size() - 1);
    }
    
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        sorted.add(root.val);
        inorder(root.right);
    }
    
    public TreeNode arrToBST(int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(sorted.get(mid)); // build
        node.left = arrToBST(left, mid - 1); // left
        node.right = arrToBST(mid + 1, right);
        return node;
    }
}