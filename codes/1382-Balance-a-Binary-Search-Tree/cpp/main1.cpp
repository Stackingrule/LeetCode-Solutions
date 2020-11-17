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
    TreeNode *balanceBST(TreeNode *root)
    {
        inorder(root);
        return convert(res, 0, res.size() - 1);
    }

private:
    vector<int> res;
    void inorder(TreeNode* root)
    {
        if (!root) return;
        inorder(root->left);
        res.push_back(root->val);
        inorder(root->right);
    }

    TreeNode* convert(vector<int> &res, int l, int r)
    {
        if (l > r) return nullptr;
        int mid = l + (r - l) / 2;
        TreeNode* root = new TreeNode(res[mid]);
        root->left = convert(res, l, mid - 1);
        root->right = convert(res, mid + 1, r);
        return root;
    }
};