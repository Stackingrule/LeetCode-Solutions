#include <iostream>

using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
 struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
 };

class Solution {
private:
	int get_len(ListNode* head) {
		int res = 0;
		while(head) {
			res++;
			head = head->next;
		}
		return res;
	}

public:
    ListNode* rotateRight(ListNode* head, int k) {
    	if(head == NULL)
    		return NULL;

    	int len = get_len(head);
    	k %= len;

    	ListNode* end = head;
    	for(int i = 0; i < k; i++) {
    		end = end->next;
    	}

    	ListNode* start = head;
    	while(end->next) {
    		start = start->next;
    		end = end->next;
    	} 

    	end->next = head;
    	head = start->next;
    	start->next = NULL;

    	return head;
    }
};

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

	Solution solve;
	ListNode* list = solve.rotateRight(&a1, 3);

	while(list) {
		cout << list->val << endl; 
		list = list->next;
	}
	return 0;
	

}