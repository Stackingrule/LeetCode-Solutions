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
    public TreeNode bstToGst(TreeNode root) {
        if(null != root)  {
            dfs(root, 0);
        }
        return root;
    }
    
    int dfs(TreeNode node, int diff) {
        if(null != node.right) {
            int rdiff = dfs(node.right, diff);    
            node.val += rdiff;
        }
        else {
            node.val += diff;
        }
        
        if(null == node.left) {
            return node.val;
        }
        else {
            int left = dfs(node.left, node.val);
            return left;
        } 
    }
}