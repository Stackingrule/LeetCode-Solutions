#include <iostream>

using namespace std;

/**
 * Definition for singly-linked list.
 * */
 
 struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
};
 


class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
    	ListNode *cur = head;
    	while(cur && cur->next) {
    		if(cur->val == cur->next->val) {
    			cur->next = cur->next->next;
    		}
    		else {
    			cur = cur->next;
    		}
    	}
    	return head;
        
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
	ListNode a2(1);
	ListNode a3(1);
	ListNode a4(1);
	ListNode a5(1);
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

	ListNode *newHead = solve.deleteDuplicates(&a1);

	printList(newHead);

	return 0;

}