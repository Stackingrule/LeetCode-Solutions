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
    vector<int> nextLargerNodes(ListNode *head)
    {
        vector<int> arr;
        int len = 0;
        while (head)
        {
            arr.push_back(head->val);
            len++;
            head = head->next;
        }
        stack<int> st;
        vector<int> res(len, 0);
        for (int i = 0; i < len; ++i)
        {
            while (!st.empty() && arr[i] > arr[st.top()])
            {
                res[st.top()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
};