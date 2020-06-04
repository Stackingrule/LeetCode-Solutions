class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        dfs(nums, cur, res);
        return res;
    }

    private void dfs(int[] nums, List<Integer> cur, List<List<Integer>> res) {
    	if (cur.size() == nums.length) {
    		res.add(new ArrayList<>(cur));
    	}
    	for (int num : nums) {
    		if (cur.contains(num)) {
    			continue;
    		}
    		cur.add(num);
    		dfs(nums, cur, res);
    		cur.remove(cur.size() - 1);
    	}
    }
}