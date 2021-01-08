class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] - mid >= k + 1) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left + k;
    }
}