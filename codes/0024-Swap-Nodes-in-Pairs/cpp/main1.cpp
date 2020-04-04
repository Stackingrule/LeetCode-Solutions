/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

/*
	迭代实现
*/

class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode *dummy = new ListNode(-1), *pre = dummy;
        dummy->next = head;
        while (pre->next && pre->next->next) {
        	ListNode *temp = pre->next->next;
        	pre->next->next = temp->next;
        	temp->next = pre->next;
        	pre->next = temp;
        	pre = temp->next;
        }

        return dummy->next;
    }
};