class Solution {
    public int sumOfUnique(int[] nums) {
        int[] set = new int[1001];
        int ans = 0;
        for (int num : nums)
            set[num]++;
        for (int num : nums) {
            if (set[num] == 1) ans += num;
        }
        return ans;
    }
}