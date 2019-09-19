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
    	if(head == nullptr) return;
    	ListNode* dummyNode;
    	dummyNode->next = head;
    	ListNode* node = dummyNode;
    	while(node) {
    		if(node->next->val == val)
    			node-> = node->next->next;
    		else
    			node = node->next;
    	}
    	return node->next;
        
    }
};