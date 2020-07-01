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
      //若 root 为空，则直接返回空列表 "[]" ；
        if(root == null){
            return "[]";
        }
      //队列 queue （包含根节点 root ）
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
      //序列化列表 res 
        StringBuilder res = new StringBuilder("[");
        while(!queue.isEmpty()){
          //节点出队，记为 node ；
            TreeNode node = queue.poll();
            if(node != null){//若 node 不为空：打印字符串 node.val ，
                res.append(node.val).append(",");
              //将左、右子节点加入 queue 
                queue.add(node.left);
                queue.add(node.right);
            }else{//否则（若 node 为空）：打印字符串 "null"
                res.append("null").append(",");
            }
        }
      //拼接列表（去除最后一个节点后的 ',' 隔开，首尾添加中括号）
        res.deleteCharAt(res.length() - 1);
        res.append("]");
      //返回序列化结果
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      // 若 data 为空，直接返回 null ；
        if(data == "[]"){
            return null;
        }
      //序列化列表 value （先去掉首尾中括号，再用逗号隔开）
        String[] value = data.substring(1,data.length() - 1).split(",");
      //根节点 root （值为 vals[0] ）
        TreeNode root = new TreeNode(Integer.parseInt(value[0]));
      //队列 queue（包含 root ）
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
      //指针i
        int i = 1;
        while(!queue.isEmpty()){
          //节点出队，记为 node ；
            TreeNode node = queue.poll();
          //构建 node 的左子节点：node.left 的值为 value[i] ，并将 node.left 入队；
            if(!value[i].equals("null")){
                node.left = new TreeNode(Integer.parseInt(value[i])); 
                queue.add(node.left);
            }
          //指针加一，找下一个节点
            i++;
          //构建 node 的右子节点：node.left 的值为 value[i] ，并将 node.left 入队；
            if(!value[i].equals("null")){
                node.right = new TreeNode(Integer.parseInt(value[i])); 
                queue.add(node.right);
            }
          //指针加一，找下一个节点
            i++;
        }
      //返回根节点root
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));