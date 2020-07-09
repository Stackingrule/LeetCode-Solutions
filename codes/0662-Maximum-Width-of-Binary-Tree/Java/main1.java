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
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> indice = new LinkedList<>();
        queue.add(root);
        indice.add(0);
        int max = 1;
        int leftMost = 0, rightMost = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = indice.poll();
                if (i == 0) leftMost = index;
                if (i == size - 1) rightMost = index;
                if (node.left != null) {
                    queue.add(node.left);
                    indice.add(index * 2);
                }
                if (node.right != null) {
                    queue.add(node.right);
                    indice.add(index * 2 + 1);
                }
            }
            max = Math.max(max, rightMost - leftMost + 1);
        }
        return max;
    }
};