public class Solution {
    TrieNode root;
    public int findMaximumXOR(int[] nums) {
        root = new TrieNode();
        for (int num : nums) {
            insert(num);
        }
        int res = 0;
        for (int num : nums) {
            res = Math.max(res, findMaxXOR(num));
        }

        return res;
    }


    public int findMaxXOR(int num) {
        int res = 0;
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num>>i)&1;
            if (node.get(bit^1) == null) {
                node = node.get(bit);
            } else {
                node = node.get(bit^1);
                res |= 1<<i;
            }
        }
        return res;
    }

    public void insert(int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num>>i)&1;
            if (node.get(bit) == null) {
                node.add(bit);
            }
            node = node.get(bit);
        }
    }
}


class TrieNode {
    TrieNode[] children;

    public TrieNode () {
        children = new TrieNode[2];
    }

    public TrieNode get(int i) {
        return children[i];
    }

    public void add(int i) {
        children[i] = new TrieNode();
    }
}