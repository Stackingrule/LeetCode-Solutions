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
    public static void dfs(TreeNode root, List<Integer> list){
        if(root == null) return;
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        dfs(root1, l1);
        dfs(root2, l2);
        int i1 = 0, i2 = 0;
        while(i1 < l1.size() || i2 < l2.size()){
            if(i2 == l2.size() || i1 < l1.size() && l1.get(i1) <= l2.get(i2)){
                ans.add(l1.get(i1));
                i1++;
            } else {
                ans.add(l2.get(i2));
                i2++;
            }
        }
        return ans;
    }
}