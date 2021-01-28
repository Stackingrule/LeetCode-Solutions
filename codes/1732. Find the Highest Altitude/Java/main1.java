class Solution {
    public int largestAltitude(int[] gain) {
        int curMax = 0;
        int curSum = 0;
        for (int n : gain) {
            curSum += n;
            if (curSum > curMax) curMax = curSum;
        }
        return curMax;
    }
}