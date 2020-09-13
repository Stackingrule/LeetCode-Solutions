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
    TreeNode *increasingBST(TreeNode *root)
    {
        return helper(root, nullptr);
    }

    TreeNode* helper(TreeNode *node, TreeNode* pre)
    {
        if (!node) return pre;
        TreeNode* res = helper(node->left, node);
        node->left = nullptr;
        node->right = helper(node->right, pre);
        return res;
    }
};