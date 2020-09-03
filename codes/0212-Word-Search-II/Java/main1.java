class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, ans, root);
            }
        }
        return ans;
    }
    private void dfs(char[][] board, int i, int j, List<String> ans, TrieNode root) {
        char c = board[i][j];
        if (c == '#' || root.next[c - 'a'] == null) return;
        root = root.next[c - 'a'];
        if (root.word != null) {
            ans.add(root.word);
            root.word = null;
        }
        board[i][j] = '#';
        if (i > 0) dfs(board, i - 1, j, ans, root);
        if (i < board.length - 1) dfs(board, i + 1, j, ans, root);
        if (j > 0) dfs(board, i, j - 1, ans, root);
        if (j < board[0].length - 1) dfs(board, i, j + 1, ans, root);
        board[i][j] = c;
    }
    
    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode cur = root;
            for (char c : word.toCharArray()) {
                if (cur.next[c - 'a'] == null) cur.next[c - 'a'] = new TrieNode();
                cur = cur.next[c - 'a'];
            }
            cur.word = word;
        }
        return root;
    }
    
    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
    
}