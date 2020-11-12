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
    // 这两个声明成全局变量，这也回溯函数就少传点参数
    private LinkedList<Integer> path = new LinkedList<>();
    private List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> BSTSequences(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();
        if (root != null) {
            dq.offer(root);
        }
        dfs(dq);
        return result;
    }

    // 1.确定递归函数返回值和参数
    public void dfs(Deque<TreeNode> dq) {
        // 2.确定递归终止条件
        // dq是该层剩下可选节点的候选队列，若队列为空，则说明没有候选元素了
        // 因此可直接把当前路径添加到结果集，然后返回
        if (dq.isEmpty()) {
            result.add(new ArrayList<Integer>(path));
            return;
        }
        
        //3.确定回溯函数的遍历过程

        // 当前层可与选择的候选节点的个数
        int size = dq.size();
        while(size > 0) {
            TreeNode cur = dq.pollFirst();
            // 向路径中添加当前值
            path.add(cur.val);
            // 记录添加的子节点数量，等会回溯时需要用
            int children = 0;
            // 向候选队列中添加子节点
            if (cur.left != null) {
                children++;
                dq.offerLast(cur.left);
            }
            if (cur.right != null) {
                children++;
                dq.offerLast(cur.right);
            }

            // 递归
            dfs(dq);

            // 回溯候选队列
            while (children > 0) {
                dq.pollLast();
                children--;
            }
            dq.offerLast(cur);
            
            // 回溯路径
            path.removeLast();
            // 当前节点处理完毕，数量减一
            size--;
        }
    }
}