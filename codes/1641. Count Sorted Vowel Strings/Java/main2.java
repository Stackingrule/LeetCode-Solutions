class Solution {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        for(int j = 0;j <= n;j++){
            for(int i = 0;i < 5;i++){
                if(j == 0) {
                    dp[i] = 1;
                } else {
                    if(i >= 1){
                        dp[i] += dp[i-1];
                    }
                }
            }
        }
        return dp[4];
    }
}