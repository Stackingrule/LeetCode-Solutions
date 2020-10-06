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
    int maxLevel = INT_MIN;
    unordered_map<int, vector<int>> map;
    void dfs(TreeNode *node, int level)
    {
        if (!node)
            return;
        maxLevel = max(maxLevel, level);
        map[level].push_back(node->val);
        dfs(node->left, level + 1);
        dfs(node->right, level + 1);
    }
    int deepestLeavesSum(TreeNode *root)
    {
        dfs(root, 0);
        int sum = 0;
        for (auto &n : map[maxLevel])
        {
            sum += n;
        }
        return sum;
    }
};