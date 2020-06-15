/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int findBottomLeftValue(TreeNode* root) {
        int max_depth = 1, res = root->val;
        preorder(root, 1, max_depth, res);
        return res;
    }

private:
	void preorder(TreeNode* node, int depth, int &max_depth, int &res) {
		if (!node) return;
		if (depth > max_depth) {
			max_depth = depth;
			res = node->val;
		}

		preorder(node->left, depth + 1, max_depth, res);
		preorder(node->right, depth + 1, max_depth, res);
	}
};