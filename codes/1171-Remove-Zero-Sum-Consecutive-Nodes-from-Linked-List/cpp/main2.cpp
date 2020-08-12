/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution
{
public:
    ListNode *removeZeroSumSublists(ListNode *head)
    {
        unordered_map<int, ListNode *> m;
        ListNode *dummy = new ListNode(-10000);
        dummy->next = head;
        int preSum = 0;
        m[0] = dummy;
        ListNode *cur = head;
        while (cur)
        {
            preSum += cur->val;
            if (m.count(preSum))
            {
                ListNode *pre = m[preSum];
                ListNode *cur = pre->next;
                int p = preSum + cur->val;
                while (p != preSum)
                {
                    m.erase(p);
                    cur = cur->next;
                    p += cur->val;
                }
                pre->next = cur->next;
            }
            else
            {
                m[preSum] = cur;
            }
            cur = cur->next;
        }
        return dummy->next;
    }
};