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
class Solution
{
public:
    int longestUnivaluePath(TreeNode *root)
    {
        int res = 0;
        if (root)
            helper(root, root->val, res);
        return res;
    }
    int helper(TreeNode *node, int parent, int &res)
    {
        if (!node)
            return 0;
        int left = helper(node->left, node->val, res);
        int right = helper(node->right, node->val, res);
        res = max(res, left + right);
        if (node->val == parent)
            return max(left, right) + 1;
        return 0;
    }
};