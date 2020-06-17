class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if (nums == null || nums.length == 0) {
        	return res;
        }
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, res, subset);

        return res;
    }

    private void dfs(int[] nums, int startIndex, List<List<Integer>> res, List<Integer> subset) {
    	res.add(new ArrayList<>(subset));

    	for (int i = startIndex; i < nums.length; ++i) {
    		if (i != 0 && nums[i] == nums[i - 1] && i > startIndex) {
    			continue;
    		}
    		subset.add(nums[i]);
    		dfs(nums, i + 1, res, subset);
    		subset.remove(subset.size() - 1);
    	}
    }
}