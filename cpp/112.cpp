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
private:
	bool visit(TreeNode* r,  int want, int now) {
		if(r == NULL) return false;

		now = now + r->val;
		if(r->left == NULL && r->right == NULL) {
			return (now == want);
		} else {
			return(visit(r->right, want, now) || visit(r->left, want, now));
		}
	}
public:
    bool hasPathSum(TreeNode* root, int sum) {
    	if(root == NULL)
    		return false;


    	return visit(root, sum, 0);
        
    }
};