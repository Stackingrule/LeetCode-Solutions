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
    bool leafSimilar(TreeNode *root1, TreeNode *root2)
    {
        string leaf1, leaf2;
        helper(root1, leaf1);
        helper(root2, leaf2);
        return leaf1 == leaf2;
    }
    void helper(TreeNode *node, string &leaf)
    {
        if (!node)
            return;
        if (!node->left && !node->right)
        {
            leaf += to_string(node->val) + "-";
        }
        helper(node->left, leaf);
        helper(node->right, leaf);
    }
};