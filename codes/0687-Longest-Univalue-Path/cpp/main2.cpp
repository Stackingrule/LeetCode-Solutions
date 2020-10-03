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
        if (!root)
            return 0;
        int sub = max(longestUnivaluePath(root->left), longestUnivaluePath(root->right));
        return max(sub, helper(root->left, root->val) + helper(root->right, root->val));
    }
    int helper(TreeNode *node, int parent)
    {
        if (!node || node->val != parent)
            return 0;
        return 1 + max(helper(node->left, node->val), helper(node->right, node->val));
    }
};