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
    TreeNode *subtreeWithAllDeepest(TreeNode *root)
    {
        int diff = depth(root->left) - depth(root->right);
        return (diff == 0) ? root : subtreeWithAllDeepest(diff > 0 ? root->left : root->right);
    }

    int depth(TreeNode *node)
    {
        return !node ? 0 : max(depth(node->left), depth(node->right)) + 1;
    }
};