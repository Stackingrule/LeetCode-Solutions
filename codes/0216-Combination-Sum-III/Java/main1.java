class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> cur = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(k, n, 1, cur, res);
        return res;
    }

    private void dfs(int k, int n, int s, List<Integer> cur, List<List<Integer>> res) {
    	if (k == 0) {
    		if (n == 0) res.add(new ArrayList<>(cur));
    		return;
    	}
    	for (int i = s; i <= 9; ++i) {
    		if (i > n) return;
    		cur.add(i);
    		dfs(k - 1, n - i, i + 1, cur, res);
    		cur.remove(cur.size() - 1);
    	}
    }
}