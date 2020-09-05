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
    void traverseAndPush(TreeNode *root, vector<int> &res)
    {
        if (!root)
            return;

        traverseAndPush(root->left, res);
        res.push_back(root->val);
        traverseAndPush(root->right, res);
    }

    void traverseAndInsert(TreeNode *root, vector<int> &res, int &start)
    {
        if (!root)
            return;

        traverseAndInsert(root->left, res, start);

        while (start < res.size() && res[start] < root->val)
        {
            start++;
        }
        res.insert(res.begin() + start, root->val);

        traverseAndInsert(root->right, res, start);
    }

    vector<int> getAllElements(TreeNode *root1, TreeNode *root2)
    {
        int start = 0;
        vector<int> res;
        traverseAndPush(root1, res);
        traverseAndInsert(root2, res, start);
        return res;
    }
};