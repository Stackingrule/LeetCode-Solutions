/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
    	return buildTree(preorder, 0, preorder.size() - 1, inorder, 0, inorder.size() - 1);
    }

private:
	TreeNode* buildTree(vector<int>& preorder, int preStart, int preEnd, vector<int>& inorder, int inStart, int inEnd) {
		if (preStart > preEnd) return nullptr;
		TreeNode* root = new TreeNode(preorder[preStart]);
		for (int i = inStart; i <= inEnd; ++i) {
			if (preorder[preStart] == inorder[i]) {
				root->left = buildTree(preorder, preStart + 1, preStart + (i - inStart), inorder, inStart, i - 1);
				root->right = buildTree(preorder, preStart + (i - inStart) + 1, preEnd, inorder, i + 1, inEnd);
			}
		}
		return root;
	}
};