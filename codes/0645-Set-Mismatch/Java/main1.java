class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] counts = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            counts[nums[i] - 1] += 1;
        }
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] == 2) {
                res[0] = i + 1;
            } else if(counts[i] == 0) {
                res[1] = i + 1;
            }
        }
        return res;
    }
}