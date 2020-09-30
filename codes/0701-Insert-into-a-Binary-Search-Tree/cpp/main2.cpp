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
    TreeNode *insertIntoBST(TreeNode *root, int val)
    {
        if (!root)
            return new TreeNode(val);
        TreeNode* cur = root;
        while (cur)
        {
            if (cur->val < val)
            {
                if (cur->right == nullptr)
                {
                    cur->right = new TreeNode(val);
                    return root;
                }
                cur = cur->right;
            }
            else {
                if (cur->left == nullptr)
                {
                    cur->left = new TreeNode(val);
                    return root;
                }
                cur = cur->left;
            }
        }
        return nullptr;
    }
};