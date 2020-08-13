class Solution {
    public int threeSumMulti(int[] A, int target) {
        int res = 0, n = A.length;
        int M = 1_000_000_007;
        HashMap<Integer, Integer> numCnt = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (numCnt.containsKey(target - A[i]))
                res = (res + numCnt.getOrDefault(target - A[i], 0)) % M;
            for (int j = 0; j < i; ++j) {
                int sum = A[i] + A[j];
                numCnt.put(sum, numCnt.getOrDefault(sum, 0) + 1);
            }
        }
        return res;
    }
}