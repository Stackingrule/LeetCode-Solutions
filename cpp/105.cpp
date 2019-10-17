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
private:
	vector<int> pre;
	vector<int> in;

	TreeNode* build(int st1, int ed1, int st2, int ed2) {
		if(st1 > ed1)
			return NULL;

		TreeNode* node = new TreeNode(pre[st1]);
		int find = -1;
		for(int  i = st2; i < ed2; i++) {
			if(in[i] == node->val) {
				find  = i;
				break;
			}
		}

		if(find == -1)	return -1;

		c = find - st2;
		node->left = build()
	}

public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
    	pre = preorder;
    	in = inorder;

    	TreeNode* node = build(0, pre, in.size() - 1);
        
    }
};