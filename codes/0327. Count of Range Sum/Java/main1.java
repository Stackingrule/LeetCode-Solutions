public class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sums= new long[nums.length + 1];
        for (int i = 0; i < nums.length; i ++) {
            sums[i + 1] = sums[i] + nums[i];
        }
        return countMergeSort(sums, 0, sums.length, lower, upper);
    }
    int countMergeSort(long[] sums, int start, int end, int lower, int upper) {
        if (end - start <= 1) {
            return 0;
        }
        int mid = start + (end - start) / 2;
        int count = countMergeSort(sums, start, mid, lower, upper) + countMergeSort(sums, mid, end, lower, upper);
        int j = mid, k = mid, t = mid;
        long[] cache = new long[end - start];
        for (int i = start, r = 0; i < mid; i ++, r ++) {
            while (k < end && sums[k] - sums[i] < lower) {
                k ++;
            }
            while (j < end && sums[j] - sums[i] <= upper) {
                j ++;
            }
            while (t < end && sums[t] < sums[i]) {
                cache[r] = sums[t];
                r ++;
                t ++;
            }
            cache[r] = sums[i];
            count += j - k;
        }
        for (int i = 0; i < t - start; i ++) {
            sums[i + start] = cache[i];
        }
        return count;
    }
}