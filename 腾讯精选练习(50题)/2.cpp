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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    	ListNode* dummy = new ListNode(-1);
    	ListNode* p1 = l1;
    	ListNode* p2 = l2;
    	ListNode* cur = dummy;
    	int carry = 0;
    	while(p1 != NULL || p2 != NULL) {
    		int num1 = p1 == NULL ? 0 : p1->val;
    		int num2 = p2 == NULL ? 0 : p2->val;
    		int value = (num1 + num2 + carry)%10;
    		carry = (num1 + num2 + carry)/10;
    		cur->next = new ListNode(value);

    		p1 = p1 ? p1->next : NULL;
    		p2 = p2 ? p2->next : NULL;
    		cur = cur->next;
    	}
    	
    	cur->next = carry ? new ListNode(1) : NULL;
    	return dummy->next;
    }
};



