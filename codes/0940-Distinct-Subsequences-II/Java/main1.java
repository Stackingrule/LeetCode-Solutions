class Solution {
    public int distinctSubseqII(String S) {
        final int mod = 1_000_000_007;
        HashMap<Character, Integer> map = new HashMap<>();
        int N = S.length();
        long[] dp = new long[N + 1];
        for(int i = 1; i <= N; i++) {
            char c = S.charAt(i - 1);
            if(!map.containsKey(c)) {
                dp[i] = (dp[i - 1] * 2 + 1) % mod;
            } else {
                int prev = map.get(c) - 1;
                dp[i] = (dp[i - 1] * 2 - dp[prev] + mod) % mod;  
            }
            map.put(c, i);
        }
        return (int)dp[N];
    }
}