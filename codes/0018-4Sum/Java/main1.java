class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
        	if (i == 0 || nums[i] != nums[i - 1]) {
        		for (int j = i + 1; j < nums.length; ++j) {
        			if (j == i + 1 || nums[j] != nums[j - 1]) {
        				int start = j + 1;
        				int end = nums.length - 1;
        				while (start < end) {
        					int sum = nums[i] + nums[j] + nums[start] + nums[end];
        					if (sum == target) {
        						List<Integer> list = new LinkedList<Integer>();
        						list.add(nums[i]);
        						list.add(nums[j]);
        						list.add(nums[start]);
        						list.add(nums[end]);
        						res.add(list);
        						int k = start + 1;
        						for (; k < nums.length; k++) {
        							if (nums[k] != nums[start]) {
        								break;
        							}
        						}
        						start = k;
        						for (k = end - 1; k >= 0; k--) {
        							if (nums[k] != nums[end]) {
        								break;
        							}
        						}
        						end = k;
        					}
        					else if (sum < target) {
        						start++;
        					}
        					else {
        						end--;
        					}
        				}
        			}
        		}
        	}
        }
        return res;
    }
}