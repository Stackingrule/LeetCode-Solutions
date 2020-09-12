class Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
        int mod = 1000000007;
        int [][] dp = new int[m][n];
        dp[i][j] = 1;
        int res = 0;
        int [][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int move = 0; move<N; move++){
            int [][] temp = new int[m][n];
            for(int x = 0; x<m; x++){
                for(int y = 0; y<n; y++){
                    for(int [] dir : dirs){
                        int dx = x+dir[0];
                        int dy = y+dir[1];
                        if(dx<0 || dx==m || dy<0 || dy==n){
                            res = (res+dp[x][y])%mod;
                        }else{
                            temp[dx][dy] = (temp[dx][dy]+dp[x][y])%mod;
                        }
                    }
                }
            }
            dp = temp;
        }
        return res;
    }
}