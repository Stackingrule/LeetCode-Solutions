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
    int findTilt(TreeNode *root)
    {
        int res = 0;
        postorder(root, res);
        return res;
    }

    int postorder(TreeNode *node, int &res)
    {
        if (!node)
            return 0;
        int leftSum = postorder(node->left, res);
        int rightSum = postorder(node->right, res);
        res += abs(leftSum - rightSum);
        return leftSum + rightSum + node->val;
    }
};