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
    ListNode* reverseList(ListNode* head) {
    	ListNode* cur = head;
    	ListNode* prev = nullptr;
    	while (cur != null) {
    		cur->next = prev;
    		prev = cur;
    		cur = cur->next;
    	}
    	return prev;
        
    }
};