/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

#include <iostream>
#include <set>

using namespace std;

struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
    	set<ListNode*> node_set;
    	while(headA) {
    		node_set.insert(headA);
    		headA = headA->next;
    	}

    	while(headB) {
    		if(node_set.find(headB) != node_set.end()) {
    			return headB;
    		}
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