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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < inorder.length; ++i) {
            indexMap.put(inorder[i], i);
        }
        return build(indexMap, inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    
    public TreeNode build(Map<Integer, Integer> indexMap, int[] inorder, int inStart, int inEnd, 
                          int[] postorder, int postStart, int postEnd) {
        if(inStart > inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int i = indexMap.get(postorder[postEnd]);
        int len = i - inStart;
        
        root.left = build(indexMap, inorder, inStart, i-1, postorder, postStart, postStart + len-1);                
        root.right = build(indexMap, inorder, i+1, inEnd, postorder, postStart+len, postEnd-1);
        
        return root;
    }
}