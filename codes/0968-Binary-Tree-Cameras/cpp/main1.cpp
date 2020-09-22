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
private:
    int ans = 0;
    int dfs(TreeNode* root)
    {
        if (root->left == nullptr && root->right == nullptr) return 0;
        int needCamera = 0;
        int covered = 0;
        if (root->left != nullptr)
        {
            int state = dfs(root->left);
            if (state == 0) needCamera = 1;
            if (state == 1) covered = 1;
        }
        if (root->right != nullptr)
        {
            int state = dfs(root->right);
            if (state == 0) needCamera = 1;
            if (state == 1) covered = 1;
        }
        if (needCamera)
        {
            ans++;
            return 1;
        }
        if (covered)
        {
            return 2;
        }
        return 0;
    }
public:
    int minCameraCover(TreeNode *root)
    {
        int state = dfs(root);
        if (state == 0) ans++;
        return ans;
    }
};