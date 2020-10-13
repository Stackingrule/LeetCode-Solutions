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
    TreeNode *subtreeWithAllDeepest(TreeNode *root)
    {
        return helper(root).second;
    }
    pair<int, TreeNode *> helper(TreeNode *node)
    {
        if (!node)
            return {0, NULL};
        auto left = helper(node->left), right = helper(node->right);
        int d1 = left.first, d2 = right.first;
        return {max(d1, d2) + 1, (d1 == d2) ? node : (d1 > d2 ? left.second : right.second)};
    }
};
