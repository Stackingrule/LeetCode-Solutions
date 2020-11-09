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
    int maxAncestorDiff(TreeNode *root)
    {
        int res = 0;
        if (root == nullptr)
            return res;
        dfs(root, root->val, root->val, res);
        return res;
    }

    void dfs(TreeNode *node, int mn, int mx, int &res)
    {
        if (node == nullptr)
            return;
        res = max(res, max(abs(node->val - mn), abs(mx - node->val)));
        mn = min(mn, node->val);
        mx = max(mx, node->val);
        dfs(node->left, mn, mx, res);
        dfs(node->right, mn, mx, res);
    }
};