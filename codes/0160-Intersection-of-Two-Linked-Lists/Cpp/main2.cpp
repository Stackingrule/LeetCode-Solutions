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
        int len_A = get_list_len(headA);
        int len_B = get_list_len(headB);
        if (len_A > len_B) {
            headA = forward_long_list(len_A, len_B, headA);
        }
        else {
            headB = forward_long_list(len_B, len_A, headB);
        }
        while (headA && headB) {
            if (headA == headB) 
                return headA;

            headA = headA->next;
            headB = headB->next;
        }
        return nullptr;
    }

private:
    int get_list_len(ListNode* head) {
        int len = 0;
        while (head) {
            len++;
            head = head->next;
        }
        return len;
    }

    ListNode* forward_long_list(int long_len, int short_len, ListNode* head) {
        int delta = long_len - short_len;
        while (head && delta) {
            head = head->next;
            delta--;
        }
        return head;
    }
};