/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> res = new LinkedList();
        if(root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            List<Integer> level = new ArrayList();
            for(int i =0;i<size;i++){
                TreeNode temp = q.remove();
                level.add(temp.val);
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
             res.add(level);
        }
          int sum = 0;
          for(int x : res.get(res.size() - 1)){ //get list of last level res.get(res.size() - 1)
              sum += x;
          }
         return sum;                 
    }
}