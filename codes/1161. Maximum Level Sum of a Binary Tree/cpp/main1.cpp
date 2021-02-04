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
    int maxLevelSum(TreeNode *root)
    {
        int maxSum = INT_MIN;
        int maxLevel = 0;
        queue<TreeNode *> q;
        q.push(root);
        int level = 1;
        while (!q.empty())
        {
            int sz = q.size();
            int levelSum = 0;
            for (int i = 0; i < sz; ++i)
            {
                TreeNode *t = q.front();
                q.pop();
                if (t->left)
                    q.push(t->left);
                if (t->right)
                    q.push(t->right);
                levelSum += t->val;
            }
            if (levelSum > maxSum)
            {
                maxSum = levelSum;
                maxLevel = level;
            }
            ++level;
        }
        return maxLevel;
    }
};