class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, Set<Integer>> m = new HashMap<>();
        int[] dp = new int[stones.length];
        for (int i = 0; i < stones.length; ++i) {
            m.put(stones[i], new HashSet<>());
        }
        m.get(stones[0]).add(0);
        int k = 0;
        for (int i = 1; i < stones.length; ++i) {
            while (dp[k] + 1 < stones[i] - stones[k]) ++k;
            for (int j = k; j < i; ++j) {
                int t = stones[i] - stones[j];
                if (m.get(stones[j]).contains(t - 1) || m.get(stones[j]).contains(t) || m.get(stones[j]).contains(t + 1)) {
                    m.get(stones[i]).add(t);
                    dp[i] = Math.max(dp[i], t);
                }
            }
        }

        return dp[stones.length - 1] > 0;
    }
}