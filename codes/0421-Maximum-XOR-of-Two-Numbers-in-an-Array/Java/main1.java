class Solution {
    public int findMaximumXOR(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j ++){
                result = Math.max(nums[i] ^ nums[j], result);
            }
        }
        return result;
    }
}