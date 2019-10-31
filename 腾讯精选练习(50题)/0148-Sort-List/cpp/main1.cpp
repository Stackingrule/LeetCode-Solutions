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
    ListNode* sortList(ListNode* head) {

        if(head == NULL || head->next == NULL)
            return head;

        ListNode* slow = head;
        ListNode* fast = head->next;
        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next->next;
        }

        ListNode* head2 = slow->next;
        slow->next = NULL;
        head = sortList(head);
        head2 = sortList(head2);
        return merge(head, head2);
    }

private:
    ListNode* merge(ListNode* a, ListNode* b){

        ListNode* dummyHead = new ListNode(-1);
        ListNode *p1 = a, *p2 = b, *p = dummyHead;
        while(p1 && p2)
            if(p1->val < p2->val){
                p->next = p1;
                p1 = p1->next;
                p = p->next;
                p->next = NULL;
            }
            else{
                p->next = p2;
                p2 = p2->next;
                p = p->next;
                p->next = NULL;
            }
        if(p1) p->next = p1;
        if(p2) p->next = p2;

        ListNode* ret = dummyHead->next;
        delete dummyHead;
        return ret;
    }
};

