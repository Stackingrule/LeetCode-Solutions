class Solution {
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = 1;
        int[] positiveNums= new int[nums.length + 2];
        for (int x : nums) {
            if (x == 0) {   // remove zeros from nums because it doesn't earn coins
                continue;
            }
            positiveNums[n++] = x;
        }
        
        positiveNums[0] = 1;
        positiveNums[n++] = 1;
        
        int[][] maxCoins = new int[n][n];
        return maxCoinsRecur(positiveNums, 0, n - 1, maxCoins);
    }
    
    // left and right are non-exclusive boundries
    public int maxCoinsRecur(int[] nums, int left, int right, int[][] maxCoins) {
        if (left + 1 == right) {
            return 0;
        }
        
        if (maxCoins[left][right] > 0) {
            return maxCoins[left][right];
        }
        
        for (int i = left + 1; i < right; ++i) {
            int coins = nums[left] * nums[i] * nums[right] 
                + maxCoinsRecur(nums, left, i, maxCoins)
                + maxCoinsRecur(nums, i, right, maxCoins);
            maxCoins[left][right] = Math.max(maxCoins[left][right], coins);
        }
        
        return  maxCoins[left][right];
    } 
}