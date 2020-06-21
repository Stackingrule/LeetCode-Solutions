/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                if (queue.peek().children != null) {
                    for (int j = 0; j < queue.peek().children.size(); ++j) {
                        queue.offer(queue.peek().children.get(j));
                    }
                }
                list.add(queue.poll().val);
            }
            res.add(list);
        }

        return res;
    }
}