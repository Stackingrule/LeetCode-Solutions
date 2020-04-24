/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    string tree2str(TreeNode* t) {
        if (!t) return "";
        string res = "";
        helper(t, res);
        return string(res.begin() + 1, res.end() - 1);
    }

private:
	void helper(TreeNode* node, string &res) {
		if (!node) return;
		res += "(" + to_string(node->val);
		if (!node->left && node->right) res += "()";
		helper(node->left, res);
		helper(node->right, res);
		res += ")";
	}
};