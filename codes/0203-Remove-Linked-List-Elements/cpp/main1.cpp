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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode *dummy = new ListNode(-1), *pre = dummy;
        dummy->next = head;
        while (pre->next) {
        	if (pre->next->val == val) {
        		ListNode *tmp = pre->next;
        		pre->next = tmp->next;
        		tmp->next = nullptr;
        		delete tmp;
        	} else {
        		pre = pre->next;
        	}
        }
        return dummy->next;
    }
};