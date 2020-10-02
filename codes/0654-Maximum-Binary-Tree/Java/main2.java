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
        List<TreeNode> v = new ArrayList<>();
        for (int num : nums) {
            TreeNode cur = new TreeNode(num);
            while (!v.isEmpty() && v.get(v.size() - 1).val < num) {
                cur.left = v.get(v.size() - 1);
                v.remove(v.size() - 1);
            }
            if (!v.isEmpty()) {
                v.get(v.size() - 1).right = cur;
            }
            v.add(cur);
        }
        return v.get(0);
    }
}