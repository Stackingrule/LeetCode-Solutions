/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

/**
这道链表重排序问题可以拆分为以下三个小问题：

1. 使用快慢指针来找到链表的中点，并将链表从中点处断开，形成两个独立的链表。

2. 将第二个链翻转。

3. 将第二个链表的元素间隔地插入第一个链表中。

 */
class Solution {
public:
    void reorderList(ListNode* head) {
        if (!head || !head->next || !head->next->next) return;
        ListNode *fast = head, *slow = head;
        while (fast->next && fast->next->next) {
        	slow = slow->next;
        	fast = fast->next->next;
        }
        ListNode *mid = slow->next;
        slow->next = nullptr;
        ListNode *last = mid, *pre = nullptr;
        while (last) {
        	ListNode *next = last->next;
        	last->next = pre;
        	pre = last;
        	last = next;
        }
        while (head && pre) {
        	ListNode *next = head->next;
        	head->next = pre;
        	pre = pre->next;
        	head->next->next = next;
        	head = next;
        }
    }
};