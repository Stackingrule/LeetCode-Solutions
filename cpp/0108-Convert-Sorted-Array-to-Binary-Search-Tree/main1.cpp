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
	TreeNode* buildBST(vector<int> &nums, int l, int r) {
		if(l > r)
			return NULL;
		if(l == r)
			return new TreeNode(nums[r]);

		int mid = l + (r - l)/2;
		TreeNode* root = new TreeNode(nums[mid]);
		root->left = buildBST(nums, l, mid - 1);
		root->right = buildBST(nums, mid + 1, r);
		return root;
	}

public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {
    	if(nums.size() == 0)
    		return NULL;

    	return buildBST(nums, 0, nums.size() - 1);
        
    }
};