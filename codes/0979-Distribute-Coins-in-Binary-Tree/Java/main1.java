/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int res = 0;

    public int distributeCoins(TreeNode root) {
        if(root == null){
            return 0;
        }

        sendCount(root);
        return res;
    }

    private int sendCount(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = sendCount(root.left);
        int right = sendCount(root.right);

        int count = root.val + left + right - 1;
        res += Math.abs(count);
        return count;
    }
}