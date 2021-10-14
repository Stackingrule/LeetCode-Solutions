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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) return null;
        TreeNode root = bstDFS(preorder, 0, preorder.length - 1);
        return root;
    }

    private TreeNode bstDFS(int[] preorder, int start, int end) {
        if (start > end) return null;
        TreeNode root = new TreeNode(preorder[start]);
        int idx = 0;
        for (idx = start + 1; idx <= end; ++idx) {
            if (preorder[idx] > preorder[start])
                break;
        }
        root.left = bstDFS(preorder, start + 1, idx - 1);
        root.right = bstDFS(preorder, idx, end);
        return root;
    }
}