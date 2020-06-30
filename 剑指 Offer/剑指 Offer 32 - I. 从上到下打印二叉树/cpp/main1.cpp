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
    vector<int> levelOrder(TreeNode* root) {
    	vector<int> res;
    	if (!root) return res;
    	deque<TreeNode*> q;
    	q.push_back(root);
    	while (q.size()) {
    		TreeNode* t = q.front();
    		q.pop_front();
    		res.push_back(t->val);

    		if (t->left) q.push_back(t->left);
    		if (t->right) q.push_back(t->right);
    	}

    	return res;
    }
};