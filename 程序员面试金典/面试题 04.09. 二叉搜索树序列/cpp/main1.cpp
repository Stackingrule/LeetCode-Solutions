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
    vector<vector<int>> res;
    vector<vector<int>> BSTSequences(TreeNode *root)
    {

        if (root == nullptr)
            return {{}};

        // queue 数据结构 并不是一个好的选项
        // queue<TreeNode*> q;  // q 用于保存 前后顺序不影响最终BST结果的 节点
        deque<TreeNode *> q;
        vector<int> path;
        q.push_back(root);

        dfs(q, path);
        return res;
    }

    void dfs(deque<TreeNode *> &q, vector<int> &path)
    {
        // cout << "size of path:" << path.size() <<endl;
        if (q.empty())
        {
            res.push_back(path);
            return;
        }

        int size = q.size();
        cout << "***" << q.size() << endl;
        for (int i = 0; i < size; i++)
        {
            auto curr = q.front();
            q.pop_front();

            path.push_back(curr->val);
            if (curr && curr->left)
                q.push_back(curr->left);
            if (curr && curr->right)
                q.push_back(curr->right);

            dfs(q, path);

            // 回溯要保证 状态还原
            if (curr && curr->left)
                q.pop_back();
            if (curr && curr->right)
                q.pop_back();
            q.push_back(curr);

            path.pop_back();
        }
    }
};