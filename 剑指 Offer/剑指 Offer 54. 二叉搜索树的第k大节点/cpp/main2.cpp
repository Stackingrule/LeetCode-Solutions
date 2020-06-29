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
    int kthLargest(TreeNode* root, int k) {
    	int res;
    	inorder(root, k, res);
    	return res;
    }

    void inorder(TreeNode* root, int &k, int& res) {
    	if (root->right && k > 0) inorder(root->right, k, res);
        if (--k == 0) {
            res = root->val;
            return;
        }
        if (root->left && k > 0) inorder(root->left, k, res);
    }
};