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
    vector<int> postorderTraversal(TreeNode* root) {
        if (!root) return {};
        vector<int> res;
        stack<TreeNode*> st{{root}};
        TreeNode *head = root;
        while (!st.empty()) {
        	TreeNode *t = st.top();
        	if ((!t->left && !t->right) || t->left == head || t->right == head) {
        		res.push_back(t->val);
        		st.pop();
        		head = t;
        	} else {
        		if (t->right) st.push(t->right);
        		if (t->left) st.push(t->left);
        	}
        }
        return res;
    }
};