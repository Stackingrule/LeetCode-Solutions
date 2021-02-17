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
private:
    int dfs(TreeNode *root, TreeNode *parent, TreeNode *grandParent)
    {
        if (root == nullptr)
            return 0;
        int sum = 0;
        if ((grandParent != nullptr) && ((grandParent->val & 1) == 0))
            sum = root->val;
        return sum + dfs(root->left, root, parent) + dfs(root->right, root, parent);
    }

public:
    int sumEvenGrandparent(TreeNode *root)
    {
        if (root == nullptr)
            return 0;
        return dfs(root, nullptr, nullptr);
    }
};