/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<ListNode*> splitListToParts(ListNode* root, int k) {
        vector<ListNode*> res(k);
        int len = 0;
        for (ListNode* node = root; node; node = node->next) ++len;
    	int avg = len / k, ext = len % k;
    	for (int i = 0; i < k && root; ++i) {
    		res[i] = root;
    		for (int j = 1; j < avg + (i < ext ? 1 : 0); ++j) {
    			root = root->next;
    		}
    		ListNode* t = root->next;
    		root->next = nullptr;
    		root = t;
    	}
    	return res;
    }
};