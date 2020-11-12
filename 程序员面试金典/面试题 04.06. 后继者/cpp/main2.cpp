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
    TreeNode *inorderSuccessor(TreeNode *root, TreeNode *p)
    {
        if (root == nullptr || p == nullptr)
            return nullptr;
        if (p->val >= root->val)
        {
            return inorderSuccessor(root->right, p);
        }
        else
        {
            TreeNode *leftRet = inorderSuccessor(root->left, p);
            return leftRet ? leftRet : root;
        }
    }
};