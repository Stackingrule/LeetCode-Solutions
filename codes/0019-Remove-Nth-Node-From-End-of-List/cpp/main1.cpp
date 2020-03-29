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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (!head->next) return nullptr;
        ListNode * pre = head, *cur = head;
        for (int i = 0; i < n; ++i) cur = cur->next;
    	if (!cur) return cur->next;
    	while (cur->next) {
    		cur = cur->next;
    		pre = pre->next;
    	}
    	pre->next = pre->next->next;
    	return head;
    }
};


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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *fast = dummy, *slow = dummy;
        while (n > 0) {
        	fast = fast->next;
        	n--;
        }
        while (fast->next) {
        	fast = fast->next;
        	slow = slow->next;
        }

        slow->next = slow->next->next;
        return dummy->next;
    }
};