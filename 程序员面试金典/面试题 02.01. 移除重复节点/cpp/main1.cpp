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
    ListNode* removeDuplicateNodes(ListNode* head) {
    	unordered_set<int> set;
    	ListNode* dummy = new ListNode(-1);
    	dummy->next = head;
    	ListNode* cur = dummy;
    	while (cur->next) {
    		if (set.count(cur->next->val)) {
    			cur->next = cur->next->next;
    		}
    		else {
    			set.insert(cur->next->val);
    			cur = cur->next;
    		}
    	}
    	return dummy->next;
    }
};