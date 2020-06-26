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
    vector<int> reversePrint(ListNode* head) {
    	vector<int> res;
        auto it = res.begin();
    	while (head) {
    		it = res.insert(it,head->val);
    		head = head->next;
    	}
    	return res;
    }
};