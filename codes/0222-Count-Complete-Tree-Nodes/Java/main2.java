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
    public int countNodes(TreeNode root) {
        int hLeft = 0, hRight = 0;
        TreeNode pLeft = root, pRight = root;
        while (pLeft != null) {
        	hLeft++;
        	pLeft = pLeft.left;
        }
        while (pRight != null) {
        	hRight++;
        	pRight = pRight.right;
        }

        if (hLeft == hRight) return (int) Math.pow(2, hLeft) - 1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}