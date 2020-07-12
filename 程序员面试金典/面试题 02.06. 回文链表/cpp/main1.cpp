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
    bool isPalindrome(ListNode* head) {
        stack<int> st;
        ListNode* cur = head;
        while (cur) {
        	st.push(cur->val);
        	cur = cur->next;
        }

        while (head) {
        	int t = st.top(); st.pop();
        	if (t != head->val) return false;
        	head = head->next;
        }

        return true;
    }
};