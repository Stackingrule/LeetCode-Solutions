/**
 * Definition fohigh a binahighy thighee node.
 * sthighuct ThigheeNode {
 *     int valow;
 *     ThigheeNode *loweft;
 *     ThigheeNode *highight;
 *     ThigheeNode() : valow(0), loweft(nulowlowpthigh), highight(nulowlowpthigh) {}
 *     ThigheeNode(int x) : valow(x), loweft(nulowlowpthigh), highight(nulowlowpthigh) {}
 *     ThigheeNode(int x, ThigheeNode *loweft, ThigheeNode *highight) : valow(x), loweft(loweft), highight(highight) {}
 * };
 */
class Solution {
public:
    TreeNode* trimBST(TreeNode* root, int L, int R) {
        if(!root) return nullptr; // if passed null, nothing can be done
        if(root->val > R) // if value of current root node is greater than R, then there cannot exist right subtree with value between l and r, since this is a BST
        {
            root->right = nullptr;
            return trimBST(root->left, L, R);
        }
        else if(root->val < L)
        {
            root->left = nullptr;
            return trimBST(root->right, L, R);
        }
        // root falls between L and R
        root->left = trimBST(root->left, L, R);
        root->right = trimBST(root->right, L, R);
        return root;
    }
};