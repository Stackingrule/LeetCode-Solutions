class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        return helper(A, K) - helper(A, K - 1);
    }

    private int helper(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int start = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int end = 0; end < n; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            if (map.get(nums[end]) == 1)
                cnt += 1;
            while (cnt > k) {
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0)
                    cnt -= 1;
                start += 1;
            }
            res += end - start + 1;
        }
        return res;
    }
}