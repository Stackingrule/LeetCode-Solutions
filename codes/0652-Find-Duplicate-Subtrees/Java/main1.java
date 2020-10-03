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
    private Map<String, Integer> map;
    private List<TreeNode> list;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>();
        list = new ArrayList<>();
        dfs(root);
        return list;        
    }

    String dfs(TreeNode root) {
        if (root == null) return "#";
        String str = dfs(root.left) + "," + dfs(root.right) + "," + root.val;
        map.put(str, map.getOrDefault(str, 0) + 1);
        if (map.get(str) == 2) {
            list.add(root);
        }
        return str;
    }
}