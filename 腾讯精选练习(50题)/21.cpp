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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
    	ListNode* p1 = l1;
    	ListNode* p2 = l2;
    	ListNode* dummyHead = new ListNode(-1);
        ListNode* dummy = dummyHead;
        
    	while(p1 && p2) {
    		if(p1->val < p2->val) {
    			dummy->next = p1;
    			dummy = p1;
    			p1 = p1->next;
    		}
    		else {
    			dummy->next = p2;
    			dummy = p2;
    			p2 = p2->next;
    		}
    	}

        if(p1) {
        	dummy->next = p1;
        }
        if(p2) {
        	dummy->next = p2;
        }
        return dummyHead->next;
    }
};