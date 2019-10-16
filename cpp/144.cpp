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
    vector<int> preorderTraversal(TreeNode* root) {

        vector<int> res;
        preorderTraversal(root, res);
        return res;
    }

private:
    void preorderTraversal(TreeNode* node, vector<int> &res){

        if(node){
            res.push_back(node->val);
            preorderTraversal(node->left, res);
            preorderTraversal(node->right, res);
        }
    }
};