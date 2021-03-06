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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        // 使用中序遍历，得到一个顺序数组
        inOrder(root, list);
        int len = list.size();
        int l = 0;
        int r = len - 1;

        // 在顺序数组中，使用二分查找法
        while (l < r) {
            int sum = list.get(l) + list.get(r);

            if (sum > k) {
                r--;
            } else if (sum < k) {
                l++;
            } else {
                assert sum == k;
                return true;
            }
        }
        return false;
    }

    private void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}