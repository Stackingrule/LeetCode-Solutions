/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> A = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next)
            A.add(node.val);
        int[] res = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.size(); ++i) {
        	//当前值比stack中的值大，则当前值是stack中值的期望值
            while (!stack.isEmpty() && A.get(stack.peek()) < A.get(i))
                res[stack.pop()] = A.get(i);
            //如果当前值比stack中的值小，则直接将index入栈
            stack.push(i);
        }
        return res;
    }

}