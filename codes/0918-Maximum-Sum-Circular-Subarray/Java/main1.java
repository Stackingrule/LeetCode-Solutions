class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int sum = 0, mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, curMax = 0, curMin = 0;
        for (int num : A) {
            curMin = Math.min(curMin + num, num);
            mn = Math.min(mn, curMin);
            curMax = Math.max(curMax + num, num);
            mx = Math.max(mx, curMax);
            sum += num;
        }

        return (sum - mn == 0) ? mx : Math.max(mx, sum - mn);
    }
}