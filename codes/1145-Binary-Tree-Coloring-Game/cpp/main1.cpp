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
    bool btreeGameWinningMove(TreeNode *root, int n, int x)
    {
        int total = 0;
        helper(root, n, x, total);
        return total > n / 2;
    }

    int helper(TreeNode *node, int n, int x, int &total)
    {
        if (node == nullptr)
            return 0;
        int ls = helper(node->left, n, x, total);
        int rs = helper(node->right, n, x, total);

        if (node->val == x)
        {
            total = max(max(ls, rs), n - rs - ls - 1);
        }
        return ls + rs + 1;
    }
};