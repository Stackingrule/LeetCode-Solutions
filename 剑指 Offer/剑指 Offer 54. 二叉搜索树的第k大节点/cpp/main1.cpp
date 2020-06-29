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
    	vector<int> res;
    	inorder(root, k, vres);
    	return res[k - 1];
    }

    void inorder(TreeNode* root, int k, vector<int> &res) {
    	if (res.size() == k) return;
    	if (root->right) inorder(root->right, k, res);
    	res.push_back(root->val);
    	if (root->left) inorder(root->left, k, res);
    }
};