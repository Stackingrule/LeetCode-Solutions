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
    bool isSymmetric(TreeNode* root) {
    	if (root == NULL) {
    		return true;
    	}
    	return isSy(root->left, root->right);
    }

    bool isSy(TreeNode* left, TreeNode* right) {
    	if (left == NULL && right == NULL) {
    		return true;
    	}
    	if (left == NULL || right == NULL) {
    		return false;
    	}
    	if (left->val != right->val) {
    		return false;
    	}
    	return isSy(left->left, right->right) && isSy(left->right, right->left);
    }
};