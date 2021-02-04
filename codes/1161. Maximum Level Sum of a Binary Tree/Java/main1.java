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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        int lv = 1;
        
        int max_lv = 0;
        
        while (! q.isEmpty()){
            
            int size = q.size();
            int level_sum = 0;
            for (int i = 0; i < size; i ++){
                TreeNode cur = q.poll();
                if(cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
                level_sum += cur.val;
            }
            if (level_sum > max){
                max = level_sum;
                max_lv = lv;
            }
            lv ++;
            
        }
        return max_lv;
    }
}