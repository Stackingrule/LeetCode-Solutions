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
    int numComponents(ListNode *head, vector<int> &G)
    {
        int res = 0;
        unordered_set<int> nodeSet(G.begin(), G.end());
        while (head)
        {
            if (!nodeSet.count(head->val))
            {
                head = head->next;
                continue;
            }
            ++res;
            while (head && nodeSet.count(head->val))
            {
                head = head->next;
            }
        }
        return res;
    }
};