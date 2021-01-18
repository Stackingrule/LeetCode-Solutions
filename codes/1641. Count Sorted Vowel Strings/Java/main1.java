class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[5][n + 1];
        for(int i=0; i<5; i++){
            for(int j = 0;j <= n; j++){
                if(j == 0){
                    dp[i][j] = 1;
                } else {
                    dp[i][j] += dp[i][j-1];
                    if(i >= 1){
                        dp[i][j] += dp[i-1][j];
                    }
                }
            }
        }
        return dp[4][n];
    }
}