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
    int findSecondMinimumValue(TreeNode *root)
    {
        return helper(root, root->val);
    }
    int helper(TreeNode *node, int first)
    {
        if (!node)
            return -1;
        if (node->val != first)
            return node->val;
        int left = helper(node->left, first), right = helper(node->right, first);
        return (left == -1 || right == -1) ? max(left, right) : min(left, right);
    }
};