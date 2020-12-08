class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int ans = 0, sum = 0;
        while (sum < target || (sum - target) % 2 == 1) {
            ++ans;
            sum += ans;
        }
        return ans;
    }
}