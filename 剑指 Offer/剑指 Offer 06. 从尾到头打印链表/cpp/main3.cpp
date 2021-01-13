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
    vector<int> reversePrint(ListNode *head)
    {
        vector<int> res;
        stack<int> s;
        ListNode *p = head;
        while (p)
        {
            s.push(p->val);
            p = p->next;
        }
        while (!s.empty())
        {
            res.push_back(s.top());
            s.pop();
        }
        return res;
    }
};
