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
    bool isSubStructure(TreeNode* A, TreeNode* B) {
        if(!A || !B) return false;
        return isSame(A,B) || isSubStructure(A->left,B) || isSubStructure(A->right,B);
    }
    
    bool isSame(TreeNode* A,TreeNode* B)
    {
        if(!B) return true;
        if(A && B) return (A->val == B->val) && isSame(A->left,B->left) && isSame(A->right,B->right);
        return false;
    }
};
