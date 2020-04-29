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
    int diameterOfBinaryTree(TreeNode* root) {
        if (!root) return 0;
        int res = getHeight(root->left) + getHeight(root->right);
        return max(res, max(diameterOfBinaryTree(root->left), diameterOfBinaryTree(root->right)));
    }

    int getHeight(TreeNode* node) {
    	if (!node) return 0;
    	if (m.count(node)) return m[node];
    	int h = 1 + max(getHeight(node->left), getHeight(node->right));
    	return m[node] = h;
    }

private:
	unordered_map<TreeNode*, int> m;
};