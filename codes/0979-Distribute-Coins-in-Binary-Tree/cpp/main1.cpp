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
    int distributeCoins(TreeNode *root)
    {
        if (!root) return 0;
        int res = 0;
        sendCount(root, res);

        return res;
    }

    int sendCount(TreeNode* node, int &res)
    {
        if (!node) return 0;

        int left = sendCount(node->left, res);
        int right = sendCount(node->right, res);

        int count = left + right + node->val - 1;
        res += abs(count);
        return count;
    }
};