class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxW = 0;
        for (int i = 0; i < accounts.length; ++i) {
            int cur = 0;
            for (int j = 0; j < accounts[i].length; ++j) {
                cur += accounts[i][j];
            }
            if (cur > maxW)
                maxW = cur;
        }
        return maxW;
    }}