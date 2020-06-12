class Solution {

	int[] data;
	Random rand = new Random();

    public Solution(int[] nums) {
        data = nums;
    }
    
    public int pick(int target) {
        int cnt = 0, res = -1;
        for (int i = 0; i < data.length; ++i) {
        	if (data[i] != target) continue;
        	cnt++;
        	if (rand.nextInt(cnt) == 0) {
        		res = i;
        	}
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */