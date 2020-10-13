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
    bool isEvenOddTree(TreeNode *root)
    {
        if (root == NULL)
            return true;

        queue<TreeNode *> q;
        int level = 0;

        q.push(root);

        while (!q.empty())
        {
            bool fromLeft = level % 2 == 0;
            int n = q.size();
            vector<int> levelNodes;

            while (n-- > 0)
            {
                TreeNode *node = q.front();
                q.pop();

                if (node->left)
                    q.push(node->left);
                if (node->right)
                    q.push(node->right);

                levelNodes.push_back(node->val);
            }

            // Look from leftSide
            if (fromLeft)
            {
                if (levelNodes[0] % 2 != 1)
                    return false;

                for (int i = 1; i < levelNodes.size(); ++i)
                {
                    if (levelNodes[i] % 2 != 1 || levelNodes[i] <= levelNodes[i - 1])
                        return false;
                }
            }
            else
            {
                // Reverse the list OR iterate from right side
                reverse(levelNodes.begin(), levelNodes.end());

                if (levelNodes[0] % 2 != 0)
                    return false;

                for (int i = 1; i < levelNodes.size(); ++i)
                {
                    if (levelNodes[i] % 2 != 0 || levelNodes[i] <= levelNodes[i - 1])
                        return false;
                }
            }

            level++;
        }

        return true;
    }
};