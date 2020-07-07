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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null) {
            if (d == 1) {
                return new TreeNode(v);
            } else {
                return null;
            }
        }

        if (d == 1) {
            TreeNode t = new TreeNode(v);
            t.left = root;
            return t;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int depth = 1;
        // for now, d=[2,depth+1]
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode t = q.poll();
                if (depth == d - 1) {
                    TreeNode left = new TreeNode(v);
                    TreeNode right = new TreeNode(v);
                    if (t.left != null) {
                        left.left = t.left;
                    }
                    if (t.right != null) {
                        right.right = t.right;
                    }
                    t.left = left;
                    t.right = right;
                    // 重要continue!
                    continue;
                }
                if (t.left != null) {
                    q.offer(t.left);
                }

                if (t.right != null) {
                    q.offer(t.right);
                }
            }

            depth++;
        }

        return root;
    }
}
