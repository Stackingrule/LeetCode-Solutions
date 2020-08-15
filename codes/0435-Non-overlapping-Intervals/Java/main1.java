class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0, n = intervals.length, last = 0;
        Arrays.sort(intervals, (int[] a, int[] b) -> a[1]- b[1]);
        for (int i = 1; i < n; ++i) {
            if (intervals[i][0] < intervals[last][1]) {
                ++res;
                if (intervals[i][1] < intervals[last][1]) last = i;
            }
            else {
                last = i;
            }
        }
        return res;
    }
}