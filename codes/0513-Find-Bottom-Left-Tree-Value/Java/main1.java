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
    private int result;
    private int maxDepth=0;
    public int findBottomLeftValue(TreeNode root) {
        inOrder(root, 0);
        return result;
    }
    
    private void inOrder(TreeNode root, int depth){
        if(root==null){
            return;
        }
        if(maxDepth<=depth){
            maxDepth=depth;
            result = root.val;
        }
        if(root.right!=null){
            inOrder(root.right, depth+1);
        }
        if(root.left!=null){
            inOrder(root.left, depth+1);
        }
    }
}