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
    int minDiffInBST(TreeNode *root)
    {
        int res = INT_MAX, pre = -1;
        helper(root, pre, res);
        return res;
    }
    void helper(TreeNode *node, int &pre, int &res)
    {
        if (!node)
            return;
        helper(node->left, pre, res);
        if (pre != -1)
            res = min(res, node->val - pre);
        pre = node->val;
        helper(node->right, pre, res);
    }
};