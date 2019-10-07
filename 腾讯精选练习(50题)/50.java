/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();

        while(l1 != null) {
        	st1.push(l1.val);
        	l1 = l1.next;
        }

        while(l2 != null) {
        	st2.push(l2.val);
        	l2 = l2.next;
        }

        int carry = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;
      
        ListNode node = null;
        ListNode pre = null;

        while(!st1.isEmpty() || !st2.isEmpty()) {
        	num1 = st1.isEmpty() ? 0 : st1.pop();
        	num2 = st2.isEmpty() ? 0 : st2.pop();
        	result = num1 + num2 + carry;
        	pre = node;
        	node = new ListNode(result%10);
        	node.next = pre;
        	carry = result / 10;
        }
        if(carry == 1) {
        	pre = node;
        	node = new ListNode(1);
        	node.next = pre;
        }
        return node;

        
    }
}