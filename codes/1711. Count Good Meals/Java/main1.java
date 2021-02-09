class Solution {
    public int countPairs(int[] deliciousness) {

        int MOD = (int) (1e9 + 7);
        int res = 0;

        for (int i = 0; i < 32; ++i) {

            int target = 1 << i;
            Map<Integer, Integer> map = new HashMap<>();
            for (int d : deliciousness) {
                if (target >= d && map.containsKey(target - d))
                    res = (res + map.get(target - d) % MOD) % MOD;
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
        }

        return res;
    }
}