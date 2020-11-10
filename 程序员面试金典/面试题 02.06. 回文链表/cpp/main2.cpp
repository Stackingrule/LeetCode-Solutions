/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution
{
public:
    bool isPalindrome(ListNode *head)
    {
        ListNode* cur = head;
        return helper(head, cur); 
    }

    bool helper(ListNode* node, ListNode* &cur)
    {
        if (!node) return true;
        bool res = helper(node->next, cur) && (cur->val == node->val);
        cur = cur->next;
        return res;
    }
};