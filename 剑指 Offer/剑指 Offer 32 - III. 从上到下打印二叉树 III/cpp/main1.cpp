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
    	int height = 1;
    	while (!q.empty()) {
    		vector<int> sub;
    		int n = q.size();
    		while (n--) {
    			TreeNode* t = q.front(); q.pop();
    			if (height & 1) {
    				sub.push_back(t->val);
    			}
    			else (sub.insert(sub.begin(), t->val));

    			if (t->left) q.push(t->left);
    			if (t->right) q.push(t->right);
    		}
    		height++;
    		res.push_back(sub);
    	}
    	return res;
    }
};