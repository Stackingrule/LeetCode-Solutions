class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* hA = headA; ListNode* hB = headB;
        while(hA != hB) {
            hA = hA == NULL ? headA : hA->next;
            hB = hB == NULL ? headB : hB->next;
        }
        return hA;
    }
};
