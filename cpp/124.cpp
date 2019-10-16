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
	int maxDeep(TreeNode* r) {
		if(r == NULL)
			return 0;
		if(r->left && r->right) {
			return r->val;
		} else {
			maxDeep(r->left);
			maxDeep(r->right);
			int temp = max(maxDeep(r->left), maxDeep(r->right)) + r->val;
			temp = max(temp, r->val);
		}
	}
public:
    int maxPathSum(TreeNode* root) {
    	ans = 0x800000000;
    	int d = maxDeep(root);
        
    }
};