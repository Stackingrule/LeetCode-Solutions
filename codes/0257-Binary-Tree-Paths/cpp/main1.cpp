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
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        if (root) helper(root, "", res);
        return res;
    }

private:
	void helper(TreeNode* root, string out, vector<string> &res) {
		if (!root->left && !root->right) res.push_back(out + to_string(root->val));
		if (root->left) helper(root->left, out + to_string(root->val) + "->", res);
		if (root->right) helper(root->right, out + to_string(root->val) + "->", res);
	}
};