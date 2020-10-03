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
    int maxLength;
    public int longestUnivaluePath(TreeNode root) {  
        maxLength = 0;
        dfs(root, 0);        
        return maxLength;
    }
    
    int dfs(TreeNode root, int prev) {
        if(root == null) {
            return 0;
        }
        
        int left = dfs(root.left, root.val);
        int right = dfs(root.right, root.val);
        
        maxLength = Math.max(maxLength, left + right);
        
        return root.val == prev ? 1 + Math.max(left, right) : 0;
    }
}