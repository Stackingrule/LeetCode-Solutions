/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    vector<ListNode*> listOfDepth(TreeNode* tree) {
        vector<ListNode*> ans;
        queue<TreeNode*> q;
        q.push(tree);
        while (!q.empty())
        {
            int sz = q.size();
            ListNode* dummy = new ListNode(-1);
            ListNode* head = dummy;
            while (sz--)
            {
                TreeNode* cur = q.front(); q.pop();
                if (cur->left)
                {
                    q.push(cur->left);
                }
                if (cur->right)
                {
                    q.push(cur->right);
                }
                head->next = new ListNode(cur->val);
                head = head->next;
            }
            ans.push_back(dummy->next);
            delete dummy;
        }
        return ans;
    }
};