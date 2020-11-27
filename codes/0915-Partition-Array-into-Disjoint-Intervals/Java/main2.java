class Solution {
    public int partitionDisjoint(int[] A) {
        int partitionIdx = 0, preMax = A[0], curMax = preMax;
        for (int i = 0; i < A.length; ++i) {
            curMax = Math.max(curMax, A[i]);
            if (A[i] < preMax) {
                preMax = curMax;
                partitionIdx = i;
            }
        }
        return partitionIdx + 1;
    }
}