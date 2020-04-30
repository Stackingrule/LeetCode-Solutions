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
由于每层的结点数是知道的，就是队列的元素个数，
所以可以直接初始化数组的大小。此时使用一个变量 leftToRight 来标记顺序，
初始时是 true，当此变量为 true 的时候，每次加入数组的位置就是i本身，
若变量为 false 了，则加入到 size-1-i 位置上，这样就直接相当于翻转了数组。
每层遍历完了之后，需要翻转 leftToRight 变量，同时不要忘了将 oneLevel 加入结果 res，
*/
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        if (!root) return {};
        vector<vector<int>> res;
        queue<TreeNode*> q{{root}};
        bool leftToRight = true;
        while (!q.empty()) {
        	int size = q.size();
        	vector<int> oneLevel(size);
        	for (int i = 0; i < size; ++i) {
        		TreeNode* t = q.front(); q.pop();
        		int idx = leftToRight ? i : (size - 1 - i);
        		oneLevel[idx] = t->val;
        		if (t->left) q.push(t.left);
        		if (t->right) q.push(t->right);
        	}
        	leftToRight = !leftToRight;
        	res.push_back(oneLevel);
        }
        return res;
    }
};