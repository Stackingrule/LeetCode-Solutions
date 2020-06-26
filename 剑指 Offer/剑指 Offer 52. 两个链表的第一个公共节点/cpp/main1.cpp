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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        set<ListNode*> s;
        ListNode* curA = headA;
        while (curA) {
            s.insert(curA);
            curA = curA->next;
        }
        while (headB) {
            if (s.count(headB)) {
                return headB;
            }
            headB = headB->next;
        }
        return NULL;
    }
};