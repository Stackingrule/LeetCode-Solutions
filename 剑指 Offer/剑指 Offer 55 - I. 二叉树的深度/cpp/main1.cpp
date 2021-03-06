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
    int maxDepth(TreeNode* root) {
    	if (root == nullptr) {
    		return 0;
    	}
    	if (root->left == nullptr) {
    		return maxDepth(root->right) + 1;
    	}
    	if (root->right == nullptr) {
    		return maxDepth(root->left) + 1;
    	}
    	return max(maxDepth(root->left), maxDepth(root->right)) + 1;
    }
};