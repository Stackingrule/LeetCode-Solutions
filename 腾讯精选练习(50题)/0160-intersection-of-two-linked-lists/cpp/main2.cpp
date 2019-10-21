#include <iostream>

using namespace std;

struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
private:
    int get_list_length(ListNode* head) {
        int len = 0;
        while(head) {
            len++;
            head = head->next;
        }
        return len;
    }

    ListNode* forward_long_list(int long_len, int short_len, ListNode* head) {
        int delta = long_len - short_len;
        while(head && delta) {
            head = head->next;
            delta--;
        }
        return head;
    }

public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int lenA = get_list_length( headA);
        int lenB = get_list_length( headB);
        if(lenA > lenB) {
            headA = forward_long_list(lenA, lenB, headA);
        } else {
            headB = forward_long_list(lenB, lenA, headB);
        }

        while(headA && headB) {
            if(headA == headB) {
                return headA;
            }
            headA = headA->next;
            headB = headB->next;
        }
        return NULL;
    }
};

int main() {
    ListNode a1(10);
    ListNode a2(9);
    ListNode b1(8);
    ListNode b2(7);
    ListNode b3(6);
    ListNode c1(5);
    ListNode c2(4);
    ListNode c3(3);

    a1.next = &a2;
    a2.next = &c1;
    b1.next = &b2;
    b2.next = &b3;
    b3.next = &c1;
    c1.next = &c2;
    c2.next = &c3;

    Solution solve;
    ListNode* ret = solve.getIntersectionNode(&a1, &b1);
    cout << ret->val;
    return 0;
}