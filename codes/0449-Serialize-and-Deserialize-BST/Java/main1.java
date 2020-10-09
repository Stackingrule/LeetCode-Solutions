/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }
    
    void dfs(TreeNode node, StringBuilder sb) {
        if(null == node) return;
        
        sb.append(node.val);
        if(null != node.left) {
            sb.append(",");
            dfs(node.left, sb);                    
        }
        
        if(null != node.right) {
            sb.append(",");
            dfs(node.right, sb);                    
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<Integer> queue = new LinkedList<>();
        for(String s: arr) {
            if(s.length() > 0) {
                queue.add(Integer.valueOf(s));    
            }
        }
        return dfs(queue);
    }
    
    public TreeNode dfs(Queue<Integer> queue) {
        if(queue.isEmpty()) return null;
        int cur = queue.poll();
        TreeNode root = new TreeNode(cur);
        Queue<Integer> small = new LinkedList<>();
        while(!queue.isEmpty() && queue.peek() < cur) {
            small.add(queue.poll());
        }
        root.left = dfs(small);
        root.right = dfs(queue);
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
