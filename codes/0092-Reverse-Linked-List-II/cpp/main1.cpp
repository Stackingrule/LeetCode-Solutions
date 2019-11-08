#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int m, int n) {
    	ListNode *dummy = new ListNode(-1);
        dummy->next = head;
    	ListNode *pre = dummy;
    	for(int i = 0; i < m - 1; ++i) pre = pre->next;

    	ListNode *cur = pre->next;
    	for(int i = m; i < n; ++i) {    		
    		ListNode *t = cur->next;
    		cur->next = t->next;
            t->next = pre->next;
    		pre->next = t;

    	}
    	return dummy->next;
    }
};

inline void printList(ListNode* head) {
	ListNode *cur = head;
	while(cur != NULL) {
		cout << cur->val << " ";
		cur = cur->next;
	}
	cout << endl;


}


int main() {

	ListNode a1(1);
	ListNode a2(2);
	ListNode a3(3);
	ListNode a4(4);
	ListNode a5(5);
	ListNode a6(6);
	ListNode a7(7);
	ListNode a8(8);
	ListNode a9(9);

	a1.next = &a2;
	a2.next = &a3;
	a3.next = &a4;
	a4.next = &a5;
	a5.next = &a6;
	a6.next = &a7;
	a7.next = &a8;
	a8.next = &a9;

	cout << "原来的链表 ：" << endl;
	printList(&a1);

	Solution solve;

	cout << "修改后的链表：" << endl;

	ListNode *newHead = solve.reverseBetween(&a1, 2, 5);

	printList(newHead);

	return 0;


}