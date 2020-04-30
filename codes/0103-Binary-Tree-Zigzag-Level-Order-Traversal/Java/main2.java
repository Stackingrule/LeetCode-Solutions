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

/*
由于每层的结点数是知道的，就是队列的元素个数，
所以可以直接初始化数组的大小。此时使用一个变量 leftToRight 来标记顺序，
初始时是 true，当此变量为 true 的时候，每次加入数组的位置就是i本身，
若变量为 false 了，则加入到 size-1-i 位置上，这样就直接相当于翻转了数组。
每层遍历完了之后，需要翻转 leftToRight 变量，同时不要忘了将 oneLevel 加入结果 res，
*/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while (q.size() > 0) {
            int size = q.size();
            List list = new ArrayList<>();
            while (size > 0) {
                TreeNode t = q.poll();
                size--;
                if (level % 2 == 0) list.add(t.val);
                else list.add(0, t.val);

                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
            level++;
            res.add(list);
        }
        return res;
    }
}