class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        for (int m : machines) {
            sum += m;
        }
        if (sum % machines.length != 0)
            return -1;
        int ans = 0, cnt = 0, avg = sum / machines.length;
        for (int m : machines) {
            cnt += m - avg;
            ans = Math.max(ans, Math.max(Math.abs(cnt), m - avg));
        }
        return ans;
    }
}