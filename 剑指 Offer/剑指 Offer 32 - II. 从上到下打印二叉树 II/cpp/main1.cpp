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
    vector<vector<int>> levelOrder(TreeNode* root) {
    	vector<vector<int>> res;
    	if (!root) return res;
    	queue<TreeNode*> q;
    	q.push(root);
    	while (!q.empty()) {
    		vector<int> sub;
    		int n = q.size();
    		while (n--) {
	    		TreeNode* t = q.front();
	    		sub.push_back(t->val);
	    		if (t->left) q.push(t->left);
	    		if (t->right) q.push(t->right);
	    		q.pop();    			
    		}
    		res.push_back(sub);
    	}
    	return res;
    }
};