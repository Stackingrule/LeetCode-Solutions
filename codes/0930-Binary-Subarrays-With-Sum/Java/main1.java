class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int res = 0, curSum = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        for (int num : A) {
            curSum += num;
            if (m.containsKey(curSum - S)) {
                res += m.get(curSum - S);
            }
            m.put(curSum, m.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}