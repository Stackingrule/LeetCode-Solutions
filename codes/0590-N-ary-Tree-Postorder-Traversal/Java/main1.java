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
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;

    }

    public void postorder(Node node, List<Integer> res) {
        if (node == null) return;
        for (Node child : node.children) {
            postorder(child, res);
        }
        res.add(node.val);
    }
}