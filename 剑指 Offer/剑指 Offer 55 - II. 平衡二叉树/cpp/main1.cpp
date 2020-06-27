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
    bool isBalanced(TreeNode* root) {
    	if (!root) return true;
    	int left, right;
    	left = getDepth(root->left);
    	right = getDepth(root->right);
    	if (abs(left - right) < 2) {
    		return isBalanced(root->left) && isBalanced(root->right);
    	}
    	else {
    		return false;
    	}
    }

    int getDepth(TreeNode* node) {
    	if (node == nullptr) return 0;
    	return max(getDepth(node->left), getDepth(node->right)) + 1;
    }
};