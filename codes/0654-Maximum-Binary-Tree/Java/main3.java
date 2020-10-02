/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null || nums.length==0) return null;
        Deque<TreeNode> stack = new ArrayDeque<>(nums.length>>1);
        for(int num : nums) {
            TreeNode cur = new TreeNode(num);
            while(!stack.isEmpty() && stack.peek().val<num){
                cur.left = stack.pop();
            }
            if(!stack.isEmpty()){
                stack.peek().right = cur;
            }
            stack.push(cur);
        }
        return stack.peekLast();
    }
}