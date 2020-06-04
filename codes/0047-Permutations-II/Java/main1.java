class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        int[] visited = new int[nums.length];
        dfs(nums, cur, visited, res);
        return res;
    }

    private void dfs(int[] nums, List<Integer> cur, int[] visited, List<List<Integer>> res) {
    	if (cur.size() == nums.length) {
    		res.add(new ArrayList<>(cur));
    		return;
    	}
    	for (int i = 0; i < nums.length; ++i) {
    		if (visited[i] == 1) continue;
    		if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] != 1) continue;
    		visited[i] = 1;
    		cur.add(nums[i]);
    		dfs(nums, cur, visited, res);
    		cur.remove(cur.size() - 1);
    		visited[i] = 0;    	}
    }
}