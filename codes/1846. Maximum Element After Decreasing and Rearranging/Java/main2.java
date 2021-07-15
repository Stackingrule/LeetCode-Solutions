class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int a : arr) ans = Math.min(ans + 1, a);
        return ans;
    }
}