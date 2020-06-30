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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return isSubStructure(A.left, B) || isSubStructure(A.right, B) || isSame(A, B);
    }

    public boolean isSame(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A != null && B != null) return (A.val == B.val) && isSame(A.left, B.left) && isSame(A.right, B.right);
        return false;
    }
}