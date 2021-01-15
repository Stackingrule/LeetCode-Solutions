class Solution {
    public int[] numMovesStonesII(int[] stones) {
        Arrays.sort(stones);
        int i = 0, n = stones.length, lower = n;
        int upper = Math.max(stones[n - 1] - n + 2 - stones[1], stones[n - 2] - stones[0] - n + 2);
        for (int j = 0; j < n; ++j) {
            while (stones[j] - stones[i] >= n)
                ++i;
            if (j - i + 1 == n - 1 && stones[j] - stones[i] == n - 2)
                lower = Math.min(lower, 2);
            else
                lower = Math.min(lower, n - (j - i + 1));
        }
        return new int[] { lower, upper };
    }
}