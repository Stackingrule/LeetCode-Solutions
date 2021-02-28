class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int j = n - 1;
        while (j > 0 && arr[j - 1] <= arr[j]) --j;
        if (j == 0) return 0;
        int ans = j;
        for (int i = 0; i < n; ++i)
        {
            if (i > 0 && arr[i - 1] > arr[i]) break;
            while (j < n && arr[i] > arr[j])
                ++j;
            ans = Math.min(ans, j - i - 1);
        }
        return ans;        
    }

}