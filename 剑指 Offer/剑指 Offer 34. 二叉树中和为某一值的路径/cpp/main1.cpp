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

    vector<vector<int>> res;
    vector<int> path;

    vector<vector<int>> pathSum(TreeNode* root, int sum) {

    	if (!root) return res;
    	sum -= root->val;
        path.push_back(root->val);

    	if (sum == 0 && !root->left && !root->right) {
    		res.push_back(path);
    	}

    	pathSum(root->left, sum);
    	pathSum(root->right, sum);

    	path.pop_back();

    	return res;
    }
};