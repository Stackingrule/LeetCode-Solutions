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

/*
最简单直接的方法就是利用层序遍历，并使用一个变量 cnt 来统计当前的层数（从0开始），
将所有的奇数层的结点值进行翻转一下即可
*/
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        if (!root) return {};
        vector<vector<int>> res;
        queue<TreeNode*> q{{root}};
        int cnt = 0;
        while (!q.empty()) {
        	vector<int> oneLevel;
        	for (int i = q.size(); i > 0; --i) {
        		TreeNode* t = q.front(); q.pop();
        		oneLevel.push_back(t->val);
        		if (t->left) q.push(t->left);
        		if (t->right) q.push(t->right);
        	}
        	if (cnt % 2 == 1) reverse(oneLevel.begin(), oneLevel.end());
        	res.push_back(oneLevel);
        	++cnt;
        }
        return res;
    }
};