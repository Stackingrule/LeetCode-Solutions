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
        
        for (int step = 2; step < n; ++step) {
            for (int left = 0; left < n - step; ++left) {
                int right = left + step;
                for (int i = left + 1; i < right; ++i) {
                    int coins = positiveNums[i] * positiveNums[left] * positiveNums[right]
                        + maxCoins[left][i] + maxCoins[i][right];
                    maxCoins[left][right] = Math.max(maxCoins[left][right], coins);
                }
            }
        }
        
        return maxCoins[0][n - 1];
    } 
}