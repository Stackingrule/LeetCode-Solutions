class Solution {
    public String optimalDivision(int[] nums) {
        StringBuilder res = new StringBuilder();
        if (nums == null || nums.length == 0) return new String();
        if (nums.length == 1) return nums[0] + "";
        if (nums.length == 2) return nums[0] + "/" + nums[1];
        res.append(nums[0]);
        res.append("/");
        res.append("(");
        res.append(nums[1]);
        for (int i = 2; i < nums.length; ++i) {
        	res.append("/");
        	res.append(nums[i]);
        }
        res.append(")");

        return res.toString();
    }
}