class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> cur = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, cur, res);
        return res;
    }

    private void dfs(int[] candidates, int target, int s, List<Integer> cur, List<List<Integer>> res) {
    	if (target == 0) {
    		res.add(new ArrayList<>(cur));
    		return;
    	}
    	for (int i = s; i < candidates.length; ++i) {
    		int num = candidates[i];
    		if (num > target) return;
    		if (i > s && candidates[i] == candidates[i - 1]) continue;
    		cur.add(num);
    		dfs(candidates, target - num, i + 1, cur, res);
    		cur.remove(cur.size() - 1);
    	}
    }
}