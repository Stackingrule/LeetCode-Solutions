class Solution {

    private int[] sum;
    Random rand;
    public Solution(int[] w) {
        this.rand = new Random();
        sum = w;
        for (int i = 1; i < w.length; ++i) {
            sum[i] = sum[i - 1] + w[i];
        }
    }
    
    public int pickIndex() {
        int x = rand.nextInt(sum[sum.length - 1]) + 1;
        int left = 0, right = sum.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sum[mid] == x) return mid;
            else if (sum[mid] < x) left = mid + 1;
            else right = mid;
        }
        return right;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */