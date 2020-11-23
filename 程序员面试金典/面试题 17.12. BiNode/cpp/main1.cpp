/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution
{
public:
    TreeNode *prev = new TreeNode(0);

    TreeNode *convertBiNode(TreeNode *root)
    {
        TreeNode *dummy = new TreeNode(-1);
        prev = dummy;
        dfs(root);
        return dummy->right;
    }

    void dfs(TreeNode *node)
    {
        if (!node)
            return;
        dfs(node->left);
        node->left = nullptr;
        prev->right = node;
        prev = node;
        dfs(node->right);
    }
};