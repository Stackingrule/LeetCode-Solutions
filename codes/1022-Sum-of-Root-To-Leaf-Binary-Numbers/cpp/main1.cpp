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
    int sumRootToLeaf(TreeNode *root)
    {
        return dfs(root, 0);
    }

private:
    int dfs(TreeNode* root, int sum)
    {
        sum = sum * 2 + root->val;
        if (!root->left && !root->right) return sum;
        int l = root->left ? dfs(root->left, sum) : 0;
        int r = root->right ? dfs(root->right, sum) : 0;
        return l + r;
    }
}; 