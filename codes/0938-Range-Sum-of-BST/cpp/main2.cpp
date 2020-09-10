class Solution
{
public:
    int rangeSumBST(TreeNode *root, int L, int R)
    {
        int res = 0;
        helper(root, L, R, res);
        return res;
    }
    void helper(TreeNode *node, int L, int R, int &res)
    {
        if (!node)
            return;
        if (node->val >= L && node->val <= R)
            res += node->val;
        helper(node->left, L, R, res);
        helper(node->right, L, R, res);
    }
};