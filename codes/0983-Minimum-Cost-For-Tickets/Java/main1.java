class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int last = days[n - 1];
        int [] dp = new int[last + 1];
        int ind = 0;
        for(int i = 1; i <= last; i++){
            if(i != days[ind]){
                dp[i] = dp[i - 1];
            }else{
                int can1 = dp[i - 1] + costs[0];
                int can2 = dp[Math.max(0, i - 7)] + costs[1];
                int can3 = dp[Math.max(0, i - 30)] + costs[2];
                dp[i] = Math.min(can1, Math.min(can2, can3));
                ind++;
            }
        }

        return dp[last];
    }
}