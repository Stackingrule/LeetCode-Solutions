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
        int res = INT_MAX;
        vector<int> v;
        helper(root, v);
        for (int i = 1; i < v.size(); ++i)
        {
            res = min(res, v[i] - v[i - 1]);
        }
        return res;
    }

    void helper(TreeNode *node, vector<int> &vals)
    {
        if (!node)
            return;
        helper(node->left, vals);
        vals.push_back(node->val);
        helper(node->right, vals);
    }
};