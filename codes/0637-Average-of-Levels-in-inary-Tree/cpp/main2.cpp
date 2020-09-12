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
    vector<double> averageOfLevels(TreeNode *root)
    {
        vector<double> res, cnt;
        helper(root, 0, cnt, res);
        for (int i = 0; i < res.size(); ++i)
        {
            res[i] /= cnt[i];
        }
        return res;
    }
    void helper(TreeNode *node, int level, vector<double> &cnt, vector<double> &res)
    {
        if (!node)
            return;
        if (res.size() <= level)
        {
            res.push_back(0);
            cnt.push_back(0);
        }
        res[level] += node->val;
        ++cnt[level];
        helper(node->left, level + 1, cnt, res);
        helper(node->right, level + 1, cnt, res);
    }
};