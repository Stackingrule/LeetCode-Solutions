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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder,
    							int preStart, int preEnd,
    							int inStart, int inEnd) {
    	if (preStart > preEnd || inStart > inEnd) {
    		return null;
    	}
    	int val = preorder[preStart];
    	TreeNode root = new TreeNode(val);
    	int k = 0;
    	for (int i = 0; i < preorder.length; ++i) {
    		if (val == inorder[i]) {
    			k = i;
    			break;
    		}
    	}

    	root.left = buildTree(preorder, inorder, preStart + 1, preStart + (k - inStart), inStart, k - 1);
    	root.right = buildTree(preorder, inorder, preStart + (k - inStart) + 1, preEnd, k + 1, inEnd);

    	return root;
    }
}