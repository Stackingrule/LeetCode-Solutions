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
    bool isSameTree(TreeNode* p, TreeNode* q) {
        stack<TreeNode*> st;
        while (p || q || !st.empty()) {
        	while (p || q) {
        		if ((p && !q) || (!p && q) || (p->val != q->val)) return false;
        		st.push(p); st.push(q);
        		p = p->left; q = q->left;
        	}
        	p = st.top(); st.pop();
        	q = st.top(); st.pop();
        	p = p->right; q = q->right;
        }
        return true;
    }
};