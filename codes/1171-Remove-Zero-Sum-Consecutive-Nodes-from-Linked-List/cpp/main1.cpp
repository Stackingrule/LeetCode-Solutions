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
        vector<ListNode *> vec;
        ListNode *dummy = new ListNode(0);
        dummy->next = head;
        vec.push_back(dummy);

        while (head != nullptr)
        {
            int sum = 0;
            vec.push_back(head);
            for (int i = vec.size() - 1; i >= 1; --i)
            {
                sum += vec[i]->val;
                if (sum == 0)
                {
                    vec[i - 1]->next = head->next;
                    vec.resize(i);
                }
            }
            head = head->next;
        }
        return dummy->next;
    }
};