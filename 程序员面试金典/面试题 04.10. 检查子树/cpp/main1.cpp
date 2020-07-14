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
    bool checkSubTree(TreeNode* t1, TreeNode* t2) {
    	if (!t1) return false;
    	if (isSame(t1, t2)) return true;
    	return checkSubTree(t1->left, t2) || checkSubTree(t1->right, t2);
    }

    bool isSame(TreeNode* p, TreeNode* q) {
    	if (!p && !q) return true;
    	if (!p || !q) return false;
    	if (p->val != q->val) return false;
    	return isSame(p->left, q->left) && isSame(p->right, q->right);
    }
};